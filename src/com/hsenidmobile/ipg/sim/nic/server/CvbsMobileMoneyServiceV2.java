/*
 * (C) Copyright 2008-2016 hSenid Software International (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Software International (Pvt) Limited.
 *
 * hSenid Software International (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package com.hsenidmobile.ipg.sim.nic.server;

import org.apache.log4j.Logger;
import zsmart.ztesoft.com.xsd.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CvbsMobileMoneyServiceV2 {

    private static final Logger logger = Logger.getLogger(CvbsMobileMoneyServiceV2.class);

    private Properties properties = new Properties();
    private Map<String, String> validMsisdnNICMap = new HashMap<String, String>();

    public CvbsMobileMoneyServiceV2() {
        init();
    }

    public void init() {
        loadProperties();

        Set<Map.Entry<Object, Object>> entries = properties.entrySet();

        for (Map.Entry entry : entries) {
            String key = (String) entry.getKey();
            String nic = (String) entry.getValue();

            logger.info("Entry [" + entry + "]");
            if (key.startsWith("valid.nic.list.")) {
                String msisdn = key.substring(key.lastIndexOf(".") + 1);


                validMsisdnNICMap.put(msisdn, nic);
            }
        }

        logger.info("Valid msisdn and NIC are loaded [" + validMsisdnNICMap + "]");
    }

    private void loadProperties() {
        try {
            InputStream resourceAsStream = CvbsMobileMoneyServiceV2.class.getClassLoader().getResourceAsStream("nic.properties");
            properties.load(resourceAsStream);
            logger.info("nic properties are loaded");
        } catch (IOException e) {
            logger.error("Error while loading nic.properties");
        }
    }

    private boolean validate(TKYCValidationRequest parameters) {
        String username = parameters.getUsername();
        String password = parameters.getPassword();
        String msisdn = parameters.getMsisdn();
        if (!isEmpty(username)
                && !isEmpty(password)
                && !isEmpty(msisdn)) {

            if (properties.getProperty("user.name").equals(username)
                    && properties.getProperty("passowrd").equals(password)) {
                logger.info("username and password are valid");

                if (validMsisdnNICMap.containsKey(msisdn)) {
                    logger.error("MSISDN is valid");
                    return true;
                } else {
                    logger.error("MSISDN is not valid");
                }
            } else {
                logger.error("Invalid username or password");
            }
        } else {
            logger.error("Invalid request [" + parameters + "]");
        }
        return false;
    }

    private boolean isEmpty(String arg) {
        return arg == null || arg.length() == 0;
    }

    public KYCValidationResponse kYCValidation(KYCValidationRequest parameters) {
        logger.info("Request " + parameters);

        KYCValidationResponse kycValidationResponse = new KYCValidationResponse();
        TKYCValidationResponse tkycValidationResponse = new TKYCValidationResponse();
        tkycValidationResponse.setMsisdn(parameters.getKYCValidationRequest().getMsisdn());
        kycValidationResponse.setKYCValidationResponse(tkycValidationResponse);

        if (validate(parameters.getKYCValidationRequest())) {
            tkycValidationResponse.setDescription("success");
            tkycValidationResponse.setNic(validMsisdnNICMap.get(parameters.getKYCValidationRequest().getMsisdn()));
            tkycValidationResponse.setStatus("0");

        } else {
            tkycValidationResponse.setDescription("failed");
            tkycValidationResponse.setNic(validMsisdnNICMap.get(parameters.getKYCValidationRequest().getMsisdn()));
            tkycValidationResponse.setStatus("2");
        }
        logger.info("Response  : " + kycValidationResponse);

        return kycValidationResponse;
    }
}

package com.hsenidmobile.ipg.sim.nic.client;

import zsmart.ztesoft.com.xsd.KYCValidationRequest;
import zsmart.ztesoft.com.xsd.KYCValidationResponse;
import zsmart.ztesoft.com.xsd.TKYCValidationRequest;

import java.rmi.RemoteException;

/**
 * Created by sampath on 10/3/16.
 */
public class ClientMain {
    public static void main(String[] args) {
        try {
            if (args.length != 4) {
                System.out.println("");
                System.out.println("Please enter argument as follows, ");
                System.out.println("./get-nic.sh <service-url> <username> <password> <msisdn>");
                System.exit(0);
            }
            System.out.println("url      : " + args[0]);
            System.out.println("username : " + args[1]);
            System.out.println("password : " + args[2]);
            System.out.println("msisdn   : " + args[3]);
            System.out.println("");
            System.out.println("Sending request ....");
            MobileMoneyServiceStub client = new MobileMoneyServiceStub(null, args[0]);
            KYCValidationRequest kYCValidationRequest = new KYCValidationRequest();
            TKYCValidationRequest tkycValidationRequest = new TKYCValidationRequest();
            tkycValidationRequest.setUsername(args[1]);
            tkycValidationRequest.setPassword(args[2]);
            tkycValidationRequest.setMsisdn(args[3]);


            kYCValidationRequest.setKYCValidationRequest(tkycValidationRequest);
            KYCValidationResponse res = client.kYCValidation(kYCValidationRequest);

            System.out.println("Response received");
            System.out.println("");
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

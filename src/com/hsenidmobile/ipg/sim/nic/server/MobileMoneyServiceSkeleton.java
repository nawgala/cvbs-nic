/**
 * MobileMoneyServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.hsenidmobile.ipg.sim.nic.server;

/**
 *  MobileMoneyServiceSkeleton java skeleton for the axisService
 */
public class MobileMoneyServiceSkeleton {

    private CvbsMobileMoneyServiceV2 serviceV2 = new CvbsMobileMoneyServiceV2();
    /**
     * Auto generated method signature
     *
     * @param kYCValidationRequest
     * @return kYCValidationResponse
     */
    public zsmart.ztesoft.com.xsd.KYCValidationResponse kYCValidation(
        zsmart.ztesoft.com.xsd.KYCValidationRequest kYCValidationRequest) {
        return serviceV2.kYCValidation(kYCValidationRequest);
    }

    /**
     * Auto generated method signature
     *
     * @param retrieveCustInfoReq
     * @return retrieveCustInfoRsp
     */
    public zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp retrieveCustInfo(
        zsmart.ztesoft.com.xsd.RetrieveCustInfoReq retrieveCustInfoReq) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#retrieveCustInfo");
    }

    /**
     * Auto generated method signature
     *
     * @param getDetails
     * @return getDetailsResponse
     */
    public zsmart.ztesoft.com.xsd.GetDetailsResponse getDetails(
        zsmart.ztesoft.com.xsd.GetDetails getDetails) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getDetails");
    }

    /**
     * Auto generated method signature
     *
     * @param createProfile
     * @return createProfileResponse
     */
    public zsmart.ztesoft.com.xsd.CreateProfileResponse createProfile(
        zsmart.ztesoft.com.xsd.CreateProfile createProfile) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#createProfile");
    }

    /**
     * Auto generated method signature
     *
     * @param registrationInfoReq
     * @return registrationInfoRsp
     */
    public zsmart.ztesoft.com.xsd.RegistrationInfoRsp registrationInfo(
        zsmart.ztesoft.com.xsd.RegistrationInfoReq registrationInfoReq) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#registrationInfo");
    }
}

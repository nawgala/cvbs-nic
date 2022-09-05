/**
 * MobileMoneyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.hsenidmobile.ipg.sim.nic.client;


/*
 *  MobileMoneyService java interface
 */
public interface MobileMoneyService {
    /**
     * Auto generated method signature
     *
     * @param kYCValidationRequest
     */
    public zsmart.ztesoft.com.xsd.KYCValidationResponse kYCValidation(
        zsmart.ztesoft.com.xsd.KYCValidationRequest kYCValidationRequest)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param registrationInfoReq
     */
    public zsmart.ztesoft.com.xsd.RegistrationInfoRsp registrationInfo(
        zsmart.ztesoft.com.xsd.RegistrationInfoReq registrationInfoReq)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getDetails
     */
    public zsmart.ztesoft.com.xsd.GetDetailsResponse getDetails(
        zsmart.ztesoft.com.xsd.GetDetails getDetails)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createProfile
     */
    public zsmart.ztesoft.com.xsd.CreateProfileResponse createProfile(
        zsmart.ztesoft.com.xsd.CreateProfile createProfile)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param retrieveCustInfoReq
     */
    public zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp retrieveCustInfo(
        zsmart.ztesoft.com.xsd.RetrieveCustInfoReq retrieveCustInfoReq)
        throws java.rmi.RemoteException;

    //
}

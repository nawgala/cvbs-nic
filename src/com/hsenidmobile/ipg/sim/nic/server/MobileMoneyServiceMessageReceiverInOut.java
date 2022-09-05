/**
 * MobileMoneyServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.hsenidmobile.ipg.sim.nic.server;


/**
 *  MobileMoneyServiceMessageReceiverInOut message receiver
 */
public class MobileMoneyServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            MobileMoneyServiceSkeleton skel = (MobileMoneyServiceSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("kYCValidation".equals(methodName)) {
                    zsmart.ztesoft.com.xsd.KYCValidationResponse kYCValidationResponse1 =
                        null;
                    zsmart.ztesoft.com.xsd.KYCValidationRequest wrappedParam = (zsmart.ztesoft.com.xsd.KYCValidationRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                              .getBody()
                                                                                                                                              .getFirstElement(),
                            zsmart.ztesoft.com.xsd.KYCValidationRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    kYCValidationResponse1 = skel.kYCValidation(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            kYCValidationResponse1, false,
                            new javax.xml.namespace.QName(
                                "http://com.ztesoft.zsmart/service",
                                "kYCValidation"));
                } else
                 if ("retrieveCustInfo".equals(methodName)) {
                    zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp retrieveCustInfoRsp3 =
                        null;
                    zsmart.ztesoft.com.xsd.RetrieveCustInfoReq wrappedParam = (zsmart.ztesoft.com.xsd.RetrieveCustInfoReq) fromOM(msgContext.getEnvelope()
                                                                                                                                            .getBody()
                                                                                                                                            .getFirstElement(),
                            zsmart.ztesoft.com.xsd.RetrieveCustInfoReq.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    retrieveCustInfoRsp3 = skel.retrieveCustInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            retrieveCustInfoRsp3, false,
                            new javax.xml.namespace.QName(
                                "http://com.ztesoft.zsmart/service",
                                "retrieveCustInfo"));
                } else
                 if ("getDetails".equals(methodName)) {
                    zsmart.ztesoft.com.xsd.GetDetailsResponse getDetailsResponse5 =
                        null;
                    zsmart.ztesoft.com.xsd.GetDetails wrappedParam = (zsmart.ztesoft.com.xsd.GetDetails) fromOM(msgContext.getEnvelope()
                                                                                                                          .getBody()
                                                                                                                          .getFirstElement(),
                            zsmart.ztesoft.com.xsd.GetDetails.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDetailsResponse5 = skel.getDetails(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDetailsResponse5, false,
                            new javax.xml.namespace.QName(
                                "http://com.ztesoft.zsmart/service",
                                "getDetails"));
                } else
                 if ("createProfile".equals(methodName)) {
                    zsmart.ztesoft.com.xsd.CreateProfileResponse createProfileResponse7 =
                        null;
                    zsmart.ztesoft.com.xsd.CreateProfile wrappedParam = (zsmart.ztesoft.com.xsd.CreateProfile) fromOM(msgContext.getEnvelope()
                                                                                                                                .getBody()
                                                                                                                                .getFirstElement(),
                            zsmart.ztesoft.com.xsd.CreateProfile.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    createProfileResponse7 = skel.createProfile(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            createProfileResponse7, false,
                            new javax.xml.namespace.QName(
                                "http://com.ztesoft.zsmart/service",
                                "createProfile"));
                } else
                 if ("registrationInfo".equals(methodName)) {
                    zsmart.ztesoft.com.xsd.RegistrationInfoRsp registrationInfoRsp9 =
                        null;
                    zsmart.ztesoft.com.xsd.RegistrationInfoReq wrappedParam = (zsmart.ztesoft.com.xsd.RegistrationInfoReq) fromOM(msgContext.getEnvelope()
                                                                                                                                            .getBody()
                                                                                                                                            .getFirstElement(),
                            zsmart.ztesoft.com.xsd.RegistrationInfoReq.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    registrationInfoRsp9 = skel.registrationInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            registrationInfoRsp9, false,
                            new javax.xml.namespace.QName(
                                "http://com.ztesoft.zsmart/service",
                                "registrationInfo"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.KYCValidationRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.KYCValidationRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.KYCValidationResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.KYCValidationResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.RetrieveCustInfoReq param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.RetrieveCustInfoReq.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.GetDetails param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.GetDetails.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.GetDetailsResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.GetDetailsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.CreateProfile param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.CreateProfile.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.CreateProfileResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.CreateProfileResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.RegistrationInfoReq param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.RegistrationInfoReq.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zsmart.ztesoft.com.xsd.RegistrationInfoRsp param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zsmart.ztesoft.com.xsd.RegistrationInfoRsp.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        zsmart.ztesoft.com.xsd.KYCValidationResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    zsmart.ztesoft.com.xsd.KYCValidationResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private zsmart.ztesoft.com.xsd.KYCValidationResponse wrapKYCValidation() {
        zsmart.ztesoft.com.xsd.KYCValidationResponse wrappedElement = new zsmart.ztesoft.com.xsd.KYCValidationResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp wrapRetrieveCustInfo() {
        zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp wrappedElement = new zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        zsmart.ztesoft.com.xsd.GetDetailsResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    zsmart.ztesoft.com.xsd.GetDetailsResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private zsmart.ztesoft.com.xsd.GetDetailsResponse wrapgetDetails() {
        zsmart.ztesoft.com.xsd.GetDetailsResponse wrappedElement = new zsmart.ztesoft.com.xsd.GetDetailsResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        zsmart.ztesoft.com.xsd.CreateProfileResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    zsmart.ztesoft.com.xsd.CreateProfileResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private zsmart.ztesoft.com.xsd.CreateProfileResponse wrapcreateProfile() {
        zsmart.ztesoft.com.xsd.CreateProfileResponse wrappedElement = new zsmart.ztesoft.com.xsd.CreateProfileResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        zsmart.ztesoft.com.xsd.RegistrationInfoRsp param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    zsmart.ztesoft.com.xsd.RegistrationInfoRsp.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private zsmart.ztesoft.com.xsd.RegistrationInfoRsp wrapRegistrationInfo() {
        zsmart.ztesoft.com.xsd.RegistrationInfoRsp wrappedElement = new zsmart.ztesoft.com.xsd.RegistrationInfoRsp();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces)
        throws org.apache.axis2.AxisFault {
        try {
            if (zsmart.ztesoft.com.xsd.CreateProfile.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.CreateProfile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.CreateProfileResponse.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.CreateProfileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.GetDetails.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.GetDetails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.GetDetailsResponse.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.GetDetailsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.KYCValidationRequest.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.KYCValidationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.KYCValidationResponse.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.KYCValidationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.RegistrationInfoReq.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.RegistrationInfoReq.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.RegistrationInfoRsp.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.RegistrationInfoRsp.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.RetrieveCustInfoReq.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.RetrieveCustInfoReq.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp.class.equals(type)) {
                return zsmart.ztesoft.com.xsd.RetrieveCustInfoRsp.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class

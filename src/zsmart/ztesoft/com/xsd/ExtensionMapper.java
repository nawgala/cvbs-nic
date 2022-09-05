/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */
package zsmart.ztesoft.com.xsd;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tRetrieveCustInfoReq".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TRetrieveCustInfoReq.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tRegistrationInfoReq".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TRegistrationInfoReq.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tgetDetailsResponse".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TgetDetailsResponse.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tcreateProfileResponse".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TcreateProfileResponse.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tRegistrationInfoRsp".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TRegistrationInfoRsp.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tKYCValidationResponse".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TKYCValidationResponse.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tRetrieveCustInfoRsp".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TRetrieveCustInfoRsp.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tgetDetails".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TgetDetails.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tKYCValidationRequest".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TKYCValidationRequest.Factory.parse(reader);
        }

        if ("http://com.ztesoft.zsmart/xsd".equals(namespaceURI) &&
                "tcreateProfile".equals(typeName)) {
            return zsmart.ztesoft.com.xsd.TcreateProfile.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}

/**
 * GetTVchannelStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public class GetTVchannelStringResponse  implements java.io.Serializable {
    private com.vinux.qq.webservice.ArrayOfString getTVchannelStringResult;

    public GetTVchannelStringResponse() {
    }

    public GetTVchannelStringResponse(
           com.vinux.qq.webservice.ArrayOfString getTVchannelStringResult) {
           this.getTVchannelStringResult = getTVchannelStringResult;
    }


    /**
     * Gets the getTVchannelStringResult value for this GetTVchannelStringResponse.
     * 
     * @return getTVchannelStringResult
     */
    public com.vinux.qq.webservice.ArrayOfString getGetTVchannelStringResult() {
        return getTVchannelStringResult;
    }


    /**
     * Sets the getTVchannelStringResult value for this GetTVchannelStringResponse.
     * 
     * @param getTVchannelStringResult
     */
    public void setGetTVchannelStringResult(com.vinux.qq.webservice.ArrayOfString getTVchannelStringResult) {
        this.getTVchannelStringResult = getTVchannelStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTVchannelStringResponse)) return false;
        GetTVchannelStringResponse other = (GetTVchannelStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTVchannelStringResult==null && other.getGetTVchannelStringResult()==null) || 
             (this.getTVchannelStringResult!=null &&
              this.getTVchannelStringResult.equals(other.getGetTVchannelStringResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetTVchannelStringResult() != null) {
            _hashCode += getGetTVchannelStringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTVchannelStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getTVchannelStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTVchannelStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getTVchannelStringResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

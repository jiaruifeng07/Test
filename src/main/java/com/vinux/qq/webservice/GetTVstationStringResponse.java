/**
 * GetTVstationStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public class GetTVstationStringResponse  implements java.io.Serializable {
    private com.vinux.qq.webservice.ArrayOfString getTVstationStringResult;

    public GetTVstationStringResponse() {
    }

    public GetTVstationStringResponse(
           com.vinux.qq.webservice.ArrayOfString getTVstationStringResult) {
           this.getTVstationStringResult = getTVstationStringResult;
    }


    /**
     * Gets the getTVstationStringResult value for this GetTVstationStringResponse.
     * 
     * @return getTVstationStringResult
     */
    public com.vinux.qq.webservice.ArrayOfString getGetTVstationStringResult() {
        return getTVstationStringResult;
    }


    /**
     * Sets the getTVstationStringResult value for this GetTVstationStringResponse.
     * 
     * @param getTVstationStringResult
     */
    public void setGetTVstationStringResult(com.vinux.qq.webservice.ArrayOfString getTVstationStringResult) {
        this.getTVstationStringResult = getTVstationStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTVstationStringResponse)) return false;
        GetTVstationStringResponse other = (GetTVstationStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTVstationStringResult==null && other.getGetTVstationStringResult()==null) || 
             (this.getTVstationStringResult!=null &&
              this.getTVstationStringResult.equals(other.getGetTVstationStringResult())));
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
        if (getGetTVstationStringResult() != null) {
            _hashCode += getGetTVstationStringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTVstationStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getTVstationStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTVstationStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getTVstationStringResult"));
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

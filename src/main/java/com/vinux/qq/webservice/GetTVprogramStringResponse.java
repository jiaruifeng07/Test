/**
 * GetTVprogramStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public class GetTVprogramStringResponse  implements java.io.Serializable {
    private com.vinux.qq.webservice.ArrayOfString getTVprogramStringResult;

    public GetTVprogramStringResponse() {
    }

    public GetTVprogramStringResponse(
           com.vinux.qq.webservice.ArrayOfString getTVprogramStringResult) {
           this.getTVprogramStringResult = getTVprogramStringResult;
    }


    /**
     * Gets the getTVprogramStringResult value for this GetTVprogramStringResponse.
     * 
     * @return getTVprogramStringResult
     */
    public com.vinux.qq.webservice.ArrayOfString getGetTVprogramStringResult() {
        return getTVprogramStringResult;
    }


    /**
     * Sets the getTVprogramStringResult value for this GetTVprogramStringResponse.
     * 
     * @param getTVprogramStringResult
     */
    public void setGetTVprogramStringResult(com.vinux.qq.webservice.ArrayOfString getTVprogramStringResult) {
        this.getTVprogramStringResult = getTVprogramStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTVprogramStringResponse)) return false;
        GetTVprogramStringResponse other = (GetTVprogramStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTVprogramStringResult==null && other.getGetTVprogramStringResult()==null) || 
             (this.getTVprogramStringResult!=null &&
              this.getTVprogramStringResult.equals(other.getGetTVprogramStringResult())));
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
        if (getGetTVprogramStringResult() != null) {
            _hashCode += getGetTVprogramStringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTVprogramStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getTVprogramStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTVprogramStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getTVprogramStringResult"));
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

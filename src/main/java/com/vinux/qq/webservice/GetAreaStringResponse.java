/**
 * GetAreaStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public class GetAreaStringResponse  implements java.io.Serializable {
    private com.vinux.qq.webservice.ArrayOfString getAreaStringResult;

    public GetAreaStringResponse() {
    }

    public GetAreaStringResponse(
           com.vinux.qq.webservice.ArrayOfString getAreaStringResult) {
           this.getAreaStringResult = getAreaStringResult;
    }


    /**
     * Gets the getAreaStringResult value for this GetAreaStringResponse.
     * 
     * @return getAreaStringResult
     */
    public com.vinux.qq.webservice.ArrayOfString getGetAreaStringResult() {
        return getAreaStringResult;
    }


    /**
     * Sets the getAreaStringResult value for this GetAreaStringResponse.
     * 
     * @param getAreaStringResult
     */
    public void setGetAreaStringResult(com.vinux.qq.webservice.ArrayOfString getAreaStringResult) {
        this.getAreaStringResult = getAreaStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAreaStringResponse)) return false;
        GetAreaStringResponse other = (GetAreaStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAreaStringResult==null && other.getGetAreaStringResult()==null) || 
             (this.getAreaStringResult!=null &&
              this.getAreaStringResult.equals(other.getGetAreaStringResult())));
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
        if (getGetAreaStringResult() != null) {
            _hashCode += getGetAreaStringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAreaStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getAreaStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAreaStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getAreaStringResult"));
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

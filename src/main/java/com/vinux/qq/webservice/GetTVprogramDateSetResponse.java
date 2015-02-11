/**
 * GetTVprogramDateSetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public class GetTVprogramDateSetResponse  implements java.io.Serializable {
    private com.vinux.qq.webservice.GetTVprogramDateSetResponseGetTVprogramDateSetResult getTVprogramDateSetResult;

    public GetTVprogramDateSetResponse() {
    }

    public GetTVprogramDateSetResponse(
           com.vinux.qq.webservice.GetTVprogramDateSetResponseGetTVprogramDateSetResult getTVprogramDateSetResult) {
           this.getTVprogramDateSetResult = getTVprogramDateSetResult;
    }


    /**
     * Gets the getTVprogramDateSetResult value for this GetTVprogramDateSetResponse.
     * 
     * @return getTVprogramDateSetResult
     */
    public com.vinux.qq.webservice.GetTVprogramDateSetResponseGetTVprogramDateSetResult getGetTVprogramDateSetResult() {
        return getTVprogramDateSetResult;
    }


    /**
     * Sets the getTVprogramDateSetResult value for this GetTVprogramDateSetResponse.
     * 
     * @param getTVprogramDateSetResult
     */
    public void setGetTVprogramDateSetResult(com.vinux.qq.webservice.GetTVprogramDateSetResponseGetTVprogramDateSetResult getTVprogramDateSetResult) {
        this.getTVprogramDateSetResult = getTVprogramDateSetResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTVprogramDateSetResponse)) return false;
        GetTVprogramDateSetResponse other = (GetTVprogramDateSetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTVprogramDateSetResult==null && other.getGetTVprogramDateSetResult()==null) || 
             (this.getTVprogramDateSetResult!=null &&
              this.getTVprogramDateSetResult.equals(other.getGetTVprogramDateSetResult())));
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
        if (getGetTVprogramDateSetResult() != null) {
            _hashCode += getGetTVprogramDateSetResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTVprogramDateSetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getTVprogramDateSetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTVprogramDateSetResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getTVprogramDateSetResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">>getTVprogramDateSetResponse>getTVprogramDateSetResult"));
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

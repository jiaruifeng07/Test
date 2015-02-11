/**
 * GetTVprogramDateSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public class GetTVprogramDateSet  implements java.io.Serializable {
    private int theTVchannelID;

    private java.lang.String theDate;

    private java.lang.String userID;

    public GetTVprogramDateSet() {
    }

    public GetTVprogramDateSet(
           int theTVchannelID,
           java.lang.String theDate,
           java.lang.String userID) {
           this.theTVchannelID = theTVchannelID;
           this.theDate = theDate;
           this.userID = userID;
    }


    /**
     * Gets the theTVchannelID value for this GetTVprogramDateSet.
     * 
     * @return theTVchannelID
     */
    public int getTheTVchannelID() {
        return theTVchannelID;
    }


    /**
     * Sets the theTVchannelID value for this GetTVprogramDateSet.
     * 
     * @param theTVchannelID
     */
    public void setTheTVchannelID(int theTVchannelID) {
        this.theTVchannelID = theTVchannelID;
    }


    /**
     * Gets the theDate value for this GetTVprogramDateSet.
     * 
     * @return theDate
     */
    public java.lang.String getTheDate() {
        return theDate;
    }


    /**
     * Sets the theDate value for this GetTVprogramDateSet.
     * 
     * @param theDate
     */
    public void setTheDate(java.lang.String theDate) {
        this.theDate = theDate;
    }


    /**
     * Gets the userID value for this GetTVprogramDateSet.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this GetTVprogramDateSet.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTVprogramDateSet)) return false;
        GetTVprogramDateSet other = (GetTVprogramDateSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.theTVchannelID == other.getTheTVchannelID() &&
            ((this.theDate==null && other.getTheDate()==null) || 
             (this.theDate!=null &&
              this.theDate.equals(other.getTheDate()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        _hashCode += getTheTVchannelID();
        if (getTheDate() != null) {
            _hashCode += getTheDate().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTVprogramDateSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getTVprogramDateSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theTVchannelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theTVchannelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

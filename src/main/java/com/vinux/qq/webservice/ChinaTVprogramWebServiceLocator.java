/**
 * ChinaTVprogramWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public class ChinaTVprogramWebServiceLocator extends org.apache.axis.client.Service implements com.vinux.qq.webservice.ChinaTVprogramWebService {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>中国电视节目预告 Web 服务</strong>，数据准确可靠，提供全国近800个电视台一个星期节目预告数据。<a
 * href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * 和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。</br>中国电视节目预告Web Services请不要用于任何商业目的，若有需要请<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。
 * QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/
 * 感谢大家的支持</strong>！<br /><br />&nbsp;
 */

    public ChinaTVprogramWebServiceLocator() {
    }


    public ChinaTVprogramWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChinaTVprogramWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChinaTVprogramWebServiceSoap12
    private java.lang.String ChinaTVprogramWebServiceSoap12_address = "http://webservice.webxml.com.cn/webservices/ChinaTVprogramWebService.asmx";

    public java.lang.String getChinaTVprogramWebServiceSoap12Address() {
        return ChinaTVprogramWebServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChinaTVprogramWebServiceSoap12WSDDServiceName = "ChinaTVprogramWebServiceSoap12";

    public java.lang.String getChinaTVprogramWebServiceSoap12WSDDServiceName() {
        return ChinaTVprogramWebServiceSoap12WSDDServiceName;
    }

    public void setChinaTVprogramWebServiceSoap12WSDDServiceName(java.lang.String name) {
        ChinaTVprogramWebServiceSoap12WSDDServiceName = name;
    }

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChinaTVprogramWebServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChinaTVprogramWebServiceSoap12(endpoint);
    }

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap12Stub _stub = new com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getChinaTVprogramWebServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChinaTVprogramWebServiceSoap12EndpointAddress(java.lang.String address) {
        ChinaTVprogramWebServiceSoap12_address = address;
    }


    // Use to get a proxy class for ChinaTVprogramWebServiceSoap
    private java.lang.String ChinaTVprogramWebServiceSoap_address = "http://webservice.webxml.com.cn/webservices/ChinaTVprogramWebService.asmx";

    public java.lang.String getChinaTVprogramWebServiceSoapAddress() {
        return ChinaTVprogramWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChinaTVprogramWebServiceSoapWSDDServiceName = "ChinaTVprogramWebServiceSoap";

    public java.lang.String getChinaTVprogramWebServiceSoapWSDDServiceName() {
        return ChinaTVprogramWebServiceSoapWSDDServiceName;
    }

    public void setChinaTVprogramWebServiceSoapWSDDServiceName(java.lang.String name) {
        ChinaTVprogramWebServiceSoapWSDDServiceName = name;
    }

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChinaTVprogramWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChinaTVprogramWebServiceSoap(endpoint);
    }

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_BindingStub _stub = new com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getChinaTVprogramWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChinaTVprogramWebServiceSoapEndpointAddress(java.lang.String address) {
        ChinaTVprogramWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap12Stub _stub = new com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap12Stub(new java.net.URL(ChinaTVprogramWebServiceSoap12_address), this);
                _stub.setPortName(getChinaTVprogramWebServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_BindingStub _stub = new com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_BindingStub(new java.net.URL(ChinaTVprogramWebServiceSoap_address), this);
                _stub.setPortName(getChinaTVprogramWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ChinaTVprogramWebServiceSoap12".equals(inputPortName)) {
            return getChinaTVprogramWebServiceSoap12();
        }
        else if ("ChinaTVprogramWebServiceSoap".equals(inputPortName)) {
            return getChinaTVprogramWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "ChinaTVprogramWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "ChinaTVprogramWebServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "ChinaTVprogramWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChinaTVprogramWebServiceSoap12".equals(portName)) {
            setChinaTVprogramWebServiceSoap12EndpointAddress(address);
        }
        else 
if ("ChinaTVprogramWebServiceSoap".equals(portName)) {
            setChinaTVprogramWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

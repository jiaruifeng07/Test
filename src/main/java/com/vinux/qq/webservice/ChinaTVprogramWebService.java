/**
 * ChinaTVprogramWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public interface ChinaTVprogramWebService extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>中国电视节目预告 Web 服务</strong>，数据准确可靠，提供全国近800个电视台一个星期节目预告数据。<a
 * href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * 和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。</br>中国电视节目预告Web Services请不要用于任何商业目的，若有需要请<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。
 * QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/
 * 感谢大家的支持</strong>！<br /><br />&nbsp;
 */
    public java.lang.String getChinaTVprogramWebServiceSoap12Address();

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap12() throws javax.xml.rpc.ServiceException;

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getChinaTVprogramWebServiceSoapAddress();

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType getChinaTVprogramWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

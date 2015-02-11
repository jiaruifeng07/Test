/**
 * ChinaTVprogramWebServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinux.qq.webservice;

public interface ChinaTVprogramWebServiceSoap_PortType extends java.rmi.Remote {

    /**
     * <br /><h3>[第一步] 获得支持的省市（地区）和分类电视列表 DataSet</h3><p>输入参数：无；返回数据：DataSet，结构为：Item(areaID)=省市和分类电视ID，Ietm(Area)=省市和分类电视名称，Item(Zone)=所属地区。</p><br
     * />
     */
    public com.vinux.qq.webservice.GetAreaDataSetResponseGetAreaDataSetResult getAreaDataSet() throws java.rmi.RemoteException;

    /**
     * <br /><h3>[第一步] 获得支持的省市（地区）和分类电视名称 String()</h3><p>输入参数：无；返回数据：一个一维字符串数组
     * String()，结构为：省市和分类电视ID@省市和分类电视名称@所属地区。</p><br />
     */
    public com.vinux.qq.webservice.ArrayOfString getAreaString() throws java.rmi.RemoteException;

    /**
     * <br /><h3>[第二步] 通过省市ID或分类电视ID获得电视台列表 DataSet</h3><p>输入参数：theAreaID
     * = 省市ID或分类电视ID（Integer）；返回数据：DataSet，结构为：Item(tvStationID)=电视台ID，Ietm(tvStationName)=电视台名称。</p><br
     * />
     */
    public com.vinux.qq.webservice.GetTVstationDataSetResponseGetTVstationDataSetResult getTVstationDataSet(int theAreaID) throws java.rmi.RemoteException;

    /**
     * <br /><h3>[第二步] 通过省市ID或分类电视ID获得电视台名称 String()</h3><p>输入参数：theAreaID
     * = 省市ID或分类电视ID（Integer）；返回数据：一个一维字符串数组 String()，结构为：电视台ID@电视台名称。</p><br
     * />
     */
    public com.vinux.qq.webservice.ArrayOfString getTVstationString(int theAreaID) throws java.rmi.RemoteException;

    /**
     * <br /><h3>[第三步] 通过电视台ID获得该电视台频道列表 DataSet</h3><p>输入参数：theTVstationID
     * = 电视台ID（Integer）；返回数据：DataSet，结构为：Item(tvChannelID)=频道ID，Ietm(tvChannel)=频道名称。</p><br
     * />
     */
    public com.vinux.qq.webservice.GetTVchannelDataSetResponseGetTVchannelDataSetResult getTVchannelDataSet(int theTVstationID) throws java.rmi.RemoteException;

    /**
     * <br /><h3>[第三步] 通过电视台ID获得该电视台频道名称 String()</h3><p>输入参数：theTVstationID
     * = 电视台ID（Integer）；返回数据：一个一维字符串数组 String()，结构为：频道ID@频道名称。</p><br />
     */
    public com.vinux.qq.webservice.ArrayOfString getTVchannelString(int theTVstationID) throws java.rmi.RemoteException;

    /**
     * <br /><h3>[第四步] 通过频道ID获得该频道节目列表 DataSet</h3><p>输入参数：theTVchannelID
     * = 频道ID（Integer），theDate=日期（String 格式：yyyy-MM-dd，如：2007-07-02，空则默认当天），userID=商业用户ID（String
     * 免费用户不需要）；返回数据：DataSet，结构为：Item(playTime)=播出时间，Ietm(meridiem)=PM或AM，Ietm(tvProgram)=节目信息，Item(tvStationInfo)=电视台信息。</p><br
     * />
     */
    public com.vinux.qq.webservice.GetTVprogramDateSetResponseGetTVprogramDateSetResult getTVprogramDateSet(int theTVchannelID, java.lang.String theDate, java.lang.String userID) throws java.rmi.RemoteException;

    /**
     * <br /><h3>[第四步] 通过频道ID获得该频道节目 String()</h3><p>输入参数：theTVchannelID
     * = 频道ID（Integer），theDate=日期（String 格式：yyyy-MM-dd，如：2007-07-02，空则默认当天），userID=商业用户ID（String
     * 免费用户不需要）；返回数据：一个一维字符串数组 String()，结构为：播出时间(AM or PM)@节目信息@电视台信息。</p><br
     * />
     */
    public com.vinux.qq.webservice.ArrayOfString getTVprogramString(int theTVchannelID, java.lang.String theDate, java.lang.String userID) throws java.rmi.RemoteException;
}

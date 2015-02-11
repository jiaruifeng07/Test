package com.vinux.qq.webservice.bizInterface.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.NodeList;

import com.vinux.qq.webservice.ChinaTVprogramWebService;
import com.vinux.qq.webservice.ChinaTVprogramWebServiceLocator;
import com.vinux.qq.webservice.ChinaTVprogramWebServiceSoap_PortType;
import com.vinux.qq.webservice.GetAreaDataSetResponseGetAreaDataSetResult;
import com.vinux.qq.webservice.GetTVchannelDataSetResponseGetTVchannelDataSetResult;
import com.vinux.qq.webservice.GetTVprogramDateSetResponseGetTVprogramDateSetResult;
import com.vinux.qq.webservice.GetTVstationDataSetResponseGetTVstationDataSetResult;
import com.vinux.qq.webservice.bizInterface.ChinaTvProgrammeBizService;

public class ChinaTvProgrammeBizServiceImpl implements
		ChinaTvProgrammeBizService {
	ChinaTVprogramWebService chinaTVprogramWebService;
	ChinaTVprogramWebServiceSoap_PortType chinaTVprogramWebServiceSoap_PortType;
	
	public ChinaTvProgrammeBizServiceImpl() throws ServiceException {
		super();
		chinaTVprogramWebService=new ChinaTVprogramWebServiceLocator();
		chinaTVprogramWebServiceSoap_PortType=chinaTVprogramWebService.getChinaTVprogramWebServiceSoap12();
	}

	public List<Map<String, Object>> getAllAreaDateList() {
		List<Map<String, Object>> relList=new ArrayList<Map<String,Object>>();
		try {
			GetAreaDataSetResponseGetAreaDataSetResult getAreaDataSetResponseGetAreaDataSetResult=chinaTVprogramWebServiceSoap_PortType.getAreaDataSet();
			MessageElement[] messageElements= getAreaDataSetResponseGetAreaDataSetResult.get_any();
			System.out.println(messageElements.length);
			MessageElement messageElement=messageElements[1];
			System.out.println(messageElement);
			NodeList children=messageElement.getElementsByTagName("AreaList");
			
			for(int i=0;i<children.getLength();i++){
				MessageElement node=(MessageElement)children.item(i);
				System.out.println("testGetAreaDataSet  "+node.getChildElement(new QName("areaID")).getValue());
				System.out.println("testGetAreaDataSet  "+node.getChildElement(new QName("Area")).getValue());
				System.out.println("testGetAreaDataSet  "+node.getChildElement(new QName("Zone")).getValue());
				Map<String, Object> map=new HashMap<String,Object>();
				map.put("areaID", node.getChildElement(new QName("areaID")).getValue());
				map.put("Area", node.getChildElement(new QName("Area")).getValue());
				map.put("Zone", node.getChildElement(new QName("Zone")).getValue());
				relList.add(map);
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return relList;
	}

	public List<Map<String, Object>> getTVstationDataList(int areaId) {
		List<Map<String, Object>> relList=new ArrayList<Map<String,Object>>();
		try {
			GetTVstationDataSetResponseGetTVstationDataSetResult getTVstationDataSetResponseGetTVstationDataSetResult=chinaTVprogramWebServiceSoap_PortType.getTVstationDataSet(areaId);
			MessageElement[] messageElementArray=getTVstationDataSetResponseGetTVstationDataSetResult.get_any();
			List elementHead=messageElementArray[0].getChildren();
			List elementBody=messageElementArray[1].getChildren();
//			System.out.println(elementBody.get(0).toString());
			NodeList children=messageElementArray[1].getElementsByTagName("TvStation");
			
			for(int i=0;i<children.getLength();i++){
				MessageElement node=(MessageElement)children.item(i);
				Map<String,Object> map=new HashMap<String, Object>();
				map.put("tvStationID", node.getChildElement(new QName("tvStationID")).getValue());
				map.put("tvStationName", node.getChildElement(new QName("tvStationName")).getValue());
				relList.add(map);
			}			

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return relList;
	}

	public List<Map<String, Object>> getTVChanelDataList(int tvStationId) {
		List<Map<String, Object>> relList=new ArrayList<Map<String,Object>>();
		try {
			GetTVchannelDataSetResponseGetTVchannelDataSetResult getTVchannelDataSetResponseGetTVchannelDataSetResult=chinaTVprogramWebServiceSoap_PortType.getTVchannelDataSet(tvStationId);
			MessageElement[] messageElementArray=getTVchannelDataSetResponseGetTVchannelDataSetResult.get_any();
			List elementHead=messageElementArray[0].getChildren();
			List elementBody=messageElementArray[1].getChildren();
//			System.out.println(elementBody.get(0).toString());
			NodeList children=messageElementArray[1].getElementsByTagName("TvChanne");
			
			for(int i=0;i<children.getLength();i++){
				MessageElement node=(MessageElement)children.item(i);
				Map<String,Object> map=new HashMap<String, Object>();
				map.put("tvChannelID", node.getChildElement(new QName("tvChannelID")).getValue());
				map.put("tvChannel", node.getChildElement(new QName("tvChannel")).getValue());
				relList.add(map);
			}			

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return relList;
	}

	public List<Map<String, Object>> getTVProgrammeDataList(int tvChanelId,String theDate,String userID) {
//		if(tvChanelId!=698)
//			return null;
		List<Map<String, Object>> relList=new ArrayList<Map<String,Object>>();
		try {
			GetTVprogramDateSetResponseGetTVprogramDateSetResult getTVprogramDateSetResponseGetTVprogramDateSetResult=chinaTVprogramWebServiceSoap_PortType.getTVprogramDateSet(tvChanelId, theDate, userID);
			MessageElement[] messageElementArray=getTVprogramDateSetResponseGetTVprogramDateSetResult.get_any();
			List elementHead=messageElementArray[0].getChildren();
			List elementBody=messageElementArray[1].getChildren();
//			System.out.println(elementBody.get(0).toString());
			NodeList children=messageElementArray[1].getElementsByTagName("tvProgramTable");
			
			for(int i=0;i<children.getLength();i++){
				MessageElement node=(MessageElement)children.item(i);
				System.out.println(node.getAsString());
				Map<String,Object> map=new HashMap<String, Object>();
				if(null!=node.getChildElement(new QName("playTime"))){
					map.put("playTime", node.getChildElement(new QName("playTime")).getValue());
					map.put("meridiem", node.getChildElement(new QName("meridiem")).getValue());
					map.put("tvProgram", node.getChildElement(new QName("tvProgram")).getValue());
					map.put("tvStationInfo", node.getChildElement(new QName("tvStationInfo")).getValue());
					relList.add(map);
					
				}
			}			

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return relList;
	}

	 
	
}

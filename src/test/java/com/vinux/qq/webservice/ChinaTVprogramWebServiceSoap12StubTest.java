package com.vinux.qq.webservice;

import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import junit.framework.TestCase;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ChinaTVprogramWebServiceSoap12StubTest extends TestCase {

	ChinaTVprogramWebService chinaTVprogramWebService;
	ChinaTVprogramWebServiceSoap_PortType chinaTVprogramWebServiceSoap_PortType; 

	@Override
	protected void setUp() throws Exception {
		chinaTVprogramWebService=new ChinaTVprogramWebServiceLocator();
		chinaTVprogramWebServiceSoap_PortType=chinaTVprogramWebService.getChinaTVprogramWebServiceSoap12();
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public void testChinaTVprogramWebServiceSoap12Stub() {
		fail("Not yet implemented");
	}

	public void testChinaTVprogramWebServiceSoap12StubURLService() {
		fail("Not yet implemented");
	}

	public void testChinaTVprogramWebServiceSoap12StubService() {
		fail("Not yet implemented");
	}

	public void testCreateCall() { 
	}

	public void testGetAreaDataSet() {
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
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void testGetAreaDataSet2() {
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
			}
			System.out.println(11111);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void testGetAreaString() {
		try {
			ArrayOfString arrayString=chinaTVprogramWebServiceSoap_PortType.getAreaString();
			String[] stringarray= arrayString.getString();
			for(int i=0;i<stringarray.length;i++){
				System.out.println(stringarray[i]);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testGetTVstationDataSet() {
		try {
			GetTVstationDataSetResponseGetTVstationDataSetResult getTVstationDataSetResponseGetTVstationDataSetResult=chinaTVprogramWebServiceSoap_PortType.getTVstationDataSet(1);
			MessageElement[] messageElementArray=getTVstationDataSetResponseGetTVstationDataSetResult.get_any();
			List elementHead=messageElementArray[0].getChildren();
			List elementBody=messageElementArray[1].getChildren();
			System.out.println(elementBody.get(0).toString());
			NodeList children=messageElementArray[1].getElementsByTagName("TvStation");
			
			for(int i=0;i<children.getLength();i++){
				MessageElement node=(MessageElement)children.item(i);
				System.out.println("testGetTVstationDataSet  "+node.getChildElement(new QName("tvStationID")).getValue());
				System.out.println("testGetTVstationDataSet  "+node.getChildElement(new QName("tvStationName")).getValue());
			}			
//			MessageElement messageElement=(MessageElement)nodeList.item(0);
//			System.out.println("messageElement.getValue()"+"   "+messageElement.getValue());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public void testGetTVstationString() {
		fail("Not yet implemented");
	}

	public void testGetTVchannelDataSet() {
	}

	public void testGetTVchannelString() {
		fail("Not yet implemented");
	}

	public void testGetTVprogramDateSet() {
		
	}

	public void testGetTVprogramString() {
		
	}
	
	

}

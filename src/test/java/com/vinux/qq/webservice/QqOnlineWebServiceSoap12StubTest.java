package com.vinux.qq.webservice;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import junit.framework.TestCase;

public class QqOnlineWebServiceSoap12StubTest extends TestCase {

	public void testQqOnlineWebServiceSoap12Stub() {
		QqOnlineWebService onlineWebService=new QqOnlineWebServiceLocator();
		try {
			QqOnlineWebServiceSoap_PortType onlineWebServiceSoap_PortType=onlineWebService.getqqOnlineWebServiceSoap12();
			String rel=onlineWebServiceSoap_PortType.qqCheckOnline("60617175");
			System.out.println(rel);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public void testQqOnlineWebServiceSoap12StubURLService() { 
	}

	public void testQqOnlineWebServiceSoap12StubService() { 
	}

	public void testCreateCall() { 
	}

	public void testQqCheckOnline() { 
	}

}

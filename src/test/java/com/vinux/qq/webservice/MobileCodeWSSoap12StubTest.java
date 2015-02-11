package com.vinux.qq.webservice;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import junit.framework.TestCase;

public class MobileCodeWSSoap12StubTest extends TestCase {
	MobileCodeWS mobileCodeWS=new MobileCodeWSLocator();
	public void testMobileCodeWSSoap12Stub() {
		
		try {
			MobileCodeWSSoap_PortType mobileCodeWSSoap_PortType=mobileCodeWS.getMobileCodeWSSoap12();
			ArrayOfString arrayOfString=mobileCodeWSSoap_PortType.getDatabaseInfo();
			String[] stringarray = arrayOfString.getString();
			for(int i=0;i<stringarray.length;i++){
				System.out.println(stringarray[i]);
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void testMobileCodeWSSoap12StubURLService() {
		fail("Not yet implemented");
	}

	public void testMobileCodeWSSoap12StubService() {
		fail("Not yet implemented");
	}

	public void testCreateCall() {
		try {
			MobileCodeWSSoap_PortType mobileCodeWSSoap_PortType=mobileCodeWS.getMobileCodeWSSoap12();
			ArrayOfString arrayOfString=mobileCodeWSSoap_PortType.getDatabaseInfo();
			String[] stringarray = arrayOfString.getString();
			for(int i=0;i<stringarray.length;i++){
				System.out.println(stringarray[i]);
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void testGetMobileCodeInfo() {
		try {
			MobileCodeWSSoap_PortType mobileCodeWSSoap_PortType=mobileCodeWS.getMobileCodeWSSoap12();
			String rel=mobileCodeWSSoap_PortType.getMobileCodeInfo("15911102357", null);
			System.out.println(rel);
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void testGetDatabaseInfo() {
		try {
			MobileCodeWSSoap_PortType mobileCodeWSSoap_PortType=mobileCodeWS.getMobileCodeWSSoap12();
			ArrayOfString arrayOfString=mobileCodeWSSoap_PortType.getDatabaseInfo();
			String[] stringarray = arrayOfString.getString();
			for(int i=0;i<stringarray.length;i++){
				System.out.println(stringarray[i]);
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

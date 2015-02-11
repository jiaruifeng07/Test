package com.vinux.qq.webservice.bizInterface.impl;

import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import junit.framework.TestCase;

import com.vinux.qq.webservice.bizInterface.ChinaTvProgrammeBizService;

public class ChinaTvProgrammeBizServiceImplTest extends TestCase {
	ChinaTvProgrammeBizService chinaTvProgrammeBizService;
	@Override
	protected void setUp() throws Exception {
		this.chinaTvProgrammeBizService=new ChinaTvProgrammeBizServiceImpl();
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public void testChinaTvProgrammeBizServiceImpl() {
		fail("Not yet implemented");
	}

	public void testGetAllAreaDateList() {
		List<Map<String,Object>> relList=this.chinaTvProgrammeBizService.getAllAreaDateList();
		for(Map<String,Object> map:relList){
			System.out.println(map.get("areaID")+"             "+map.get("Area")+"           "+map.get("Zone"));
		}
	}
	public void testGetAllTVstationDataList() {
		List<Map<String,Object>> allAreaRelList=this.chinaTvProgrammeBizService.getAllAreaDateList();
		for(Map<String,Object> map:allAreaRelList){
			int areaID=Integer.parseInt(map.get("areaID").toString());
			System.out.println(map.get("areaID")+"             "+map.get("Area")+"           "+map.get("Zone"));
			System.out.println("areaID "+areaID);
			List<Map<String, Object>>   tvStationRelList=this.chinaTvProgrammeBizService.getTVstationDataList(areaID);
			for(Map<String,Object> tvStationMap:tvStationRelList){
				String tvStationId=tvStationMap.get("tvStationID").toString();
				String tvStationName=tvStationMap.get("tvStationName").toString();
				System.out.println("tvStationId:"+tvStationId + "   tvStationName:"+tvStationName );
				
			}
			
		}
	}
	public void testGetAllTVChanelDataList() {
		List<Map<String,Object>> allAreaRelList=this.chinaTvProgrammeBizService.getAllAreaDateList();
		for(Map<String,Object> map:allAreaRelList){
			int areaID=Integer.parseInt(map.get("areaID").toString());
			System.out.println(map.get("areaID")+"             "+map.get("Area")+"           "+map.get("Zone"));
			System.out.println("areaID "+areaID);
			List<Map<String, Object>>   tvStationRelList=this.chinaTvProgrammeBizService.getTVstationDataList(areaID);
			for(Map<String,Object> tvStationMap:tvStationRelList){
				String tvStationId=tvStationMap.get("tvStationID").toString();
				String tvStationName=tvStationMap.get("tvStationName").toString();
				int tvStationId_int=Integer.parseInt(tvStationId);
				System.out.println("tvStationId:"+tvStationId + "   tvStationName:"+tvStationName );
				List<Map<String,Object>> tvChanelRelList=this.chinaTvProgrammeBizService.getTVChanelDataList(tvStationId_int);
				for(Map<String, Object> tvChanelMap:tvChanelRelList){
					String tvChannelID=tvChanelMap.get("tvChannelID").toString();
					String tvChannel=tvChanelMap.get("tvChannel").toString();
					System.out.println("tvChannelID:"+tvChannelID+"   tvChannel:"+tvChannel);
					int tvChanelId=Integer.parseInt(tvChannelID);
					List<Map<String, Object>> tvProgrammeList=this.chinaTvProgrammeBizService.getTVProgrammeDataList(tvChanelId, "", "");
					if(null!=tvProgrammeList&&tvProgrammeList.size()>0){
						for(Map<String,Object> tvProgrammeMap:tvProgrammeList){
							if(null!=tvProgrammeMap.get("playTime")){
								String playTime=tvProgrammeMap.get("playTime").toString();
								String meridiem=tvProgrammeMap.get("meridiem").toString();
								String tvProgram=tvProgrammeMap.get("tvProgram").toString();
								String tvStationInfo=tvProgrammeMap.get("tvStationInfo").toString();
								System.out.println("playTime:"+playTime+" meridiem:"+meridiem+" tvProgram:"+tvProgram+" tvStationInfo:"+tvStationInfo);
							}
							
						}
					}else{
						System.out.println("无节目");
					}
				}
			}
			
		}		
	}
	
	public void testGetTVChanelDataList() {
	}	

}

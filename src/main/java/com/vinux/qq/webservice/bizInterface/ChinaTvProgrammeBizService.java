package com.vinux.qq.webservice.bizInterface;

import java.util.List;
import java.util.Map;

public interface ChinaTvProgrammeBizService {

	/**
	 * 获取全部的地区数据
	 * @return
	 */
	public List<Map<String,Object>> getAllAreaDateList();
	
	/**
	 * 
	 * 通过省市ID或分类电视ID获得电视台列表
	 * @return
	 */
	public List<Map<String,Object>> getTVstationDataList(int areaId);

	/**
	 * 
	 * 通过电视台ID获得该电视台频道列表
	 * @return
	 */
	public List<Map<String,Object>> getTVChanelDataList(int tvStationId);

	/**
	 * 
	 * 通过频道ID获得该频道节目列表
	 * @return
	 */
	public List<Map<String, Object>> getTVProgrammeDataList(int tvChanelId,String theDate,String userID);
}

package ru.cyfn.TrackerCommunication;

import java.util.*;

class LBSExtData extends DataContent {

	private DataContent dateTime;
	private DataContent lbsData;
	
	public LBSExtData(byte[] rawData) {
		super(rawData);
		dateTime = new DateTimeData(Arrays.copyOfRange(rawData, 0, 6));
		lbsData = new LBSData(Arrays.copyOfRange(rawData, 6, rawData.length));
	}
	
	public byte[] toRawBytes() {
		return null;
	}
	
	public LinkedHashMap<String, String> getDataContent() {
		LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();
		result.putAll(dateTime.getDataContent());
		result.putAll(lbsData.getDataContent());
		return result;
	}	
}
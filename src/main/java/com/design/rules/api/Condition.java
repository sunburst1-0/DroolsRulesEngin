package com.design.rules.api;

public class Condition {

	private String roomName;
	private String conditionType;
	private int conditionLimit;
	private int humidityConditionLimit;
	private int nowValue;
//	private int value;
	private String message;
	
//	public int getValue() {
//		return value;
//	}
//
//	public void setValue(int value) {
//		this.value = value;
//	}

	
	public int getNowValue() {
		return nowValue;
	}

	public void setNowValue(int nowValue) {
		this.nowValue = nowValue;
	}


	public String getroomName() {
		return roomName;
	}

	public void setName(String roomName) {
		this.roomName = roomName;
	}

	public String getConditionType() {
		return conditionType;
	}

	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}

	public int getConditionLimit() {
		return conditionLimit;
	}

	public void setConditionLimit(int conditionLimit) {
		this.conditionLimit = conditionLimit;
	}
	
	

	public int getHumidityConditionLimit() {
		return humidityConditionLimit;
	}

	public void setHumidityConditionLimit(int humidityConditionLimit) {
		this.humidityConditionLimit = humidityConditionLimit;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}

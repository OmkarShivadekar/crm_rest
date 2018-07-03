package com.luv2code.springdemo.rest;

/**
 * @author Omkar Shivadekar
 * Date : 02-Jul-2018
 * Time : 3:08:18 PM
 */
public class CustomerErrorResponse {
	
	
	private int status;
	
	private String messgae;
	
	private long timeStamp;
	
	public CustomerErrorResponse() {

	}

	public CustomerErrorResponse(int status, String messgae, long timeStamp) {
		this.status = status;
		this.messgae = messgae;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
	
	
	
	

}

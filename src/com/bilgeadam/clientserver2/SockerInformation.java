package com.bilgeadam.clientserver2;

import java.util.Date;

public class SockerInformation {
	// özellikler
	private int id;
	private String ipAddress;
	private int port;
	private Date logsDate;
	
	// default
	public SockerInformation() {
		this.ipAddress = "localhost";
		this.port = 6666;
		
		logsDate = new Date(System.currentTimeMillis());
	}
	
	// parametreli constructor
	public SockerInformation(int id, String ipAddress, int port) {
		this.id = id;
		this.ipAddress = ipAddress;
		this.port = port;
	}
	
	// toString
	@Override
	public String toString() {
		return "SockerInformation [id=" + id + ", ipAddress=" + ipAddress + ", port=" + port + ", logsDate=" + logsDate
				+ "]";
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public Date getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(Date logsDate) {
		this.logsDate = logsDate;
	}
	
}

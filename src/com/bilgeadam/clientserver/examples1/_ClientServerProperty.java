package com.bilgeadam.clientserver.examples1;

import java.util.Date;

public class _ClientServerProperty {
	private int id;
	private String hostName;
	private int port;
	private Date logsDate;
	
	public _ClientServerProperty() {
		hostName = "localhost";
		port = 4444;
	}
	
	// parametresiz constructor
	public _ClientServerProperty(String hostName, int port) {
		this.hostName = hostName;
		this.port = port;
	}
	
	// toString
	@Override
	public String toString() {
		return "_ClientServerProperty [id=" + id + ", hostName=" + hostName + ", port=" + port + ", logsDate="
				+ logsDate + "]";
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getHostName() {
		return hostName;
	}
	
	public void setHostName(String hostName) {
		this.hostName = hostName;
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

package com.bilgeadam.clientserver.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface _1_IRmiInterface extends Remote {
	
	public void messageSend(String message) throws RemoteException;
}

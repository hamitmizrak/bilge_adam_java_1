package com.bilgeadam.clientserver.rmi;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class _3_Server extends UnicastRemoteObject implements _1_IRmiInterface {
	
	// mri server
	
	Registry registry;
	String ipAddress;
	int port;
	
	public _3_Server() throws RemoteException {
		super();
		
		try {
			ipAddress = (InetAddress.getLocalHost().toString());
			System.out.println("Server hazýr");
		} catch (UnknownHostException ex) {
			System.out.println(ex);
		}
		port = 1316;
		
		try {
			registry = LocateRegistry.createRegistry(port);
		} catch (RemoteException ex) {
			System.out.println(ex);
		}
		
		try {
			
			registry.rebind("Local Interface", this);
			
		} catch (AccessException e) {
			
			e.printStackTrace();
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	@Override
	public void messageSend(String message) throws RemoteException {
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		
		try {
			
			_3_Server obj = new _3_Server();
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
			
		}
	}
}
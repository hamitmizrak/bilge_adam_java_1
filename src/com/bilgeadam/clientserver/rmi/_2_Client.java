package com.bilgeadam.clientserver.rmi;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

// rmi client
public class _2_Client {
	
	Registry registry = null;
	_1_IRmiInterface interface1 = null;
	
	// parametresiz costructor
	public _2_Client() {
		String mesaj = JOptionPane.showInputDialog("Lütfen Mesaj giriniz");
		
		//
		try {
			// 127.0.0.1 localhost
			registry = LocateRegistry.getRegistry("localhost", 6666);
		} catch (RemoteException e) {
			System.out.println("Remote excepiton ");
			e.printStackTrace();
		}
		
		//
		try {
			interface1 = ((_1_IRmiInterface) registry.lookup("Local Interface"));
		} catch (AccessException ex) {
			System.out.println(ex);
		}
		
		catch (RemoteException ex) {
			System.out.println(ex);
		}
		
		catch (NotBoundException ex) {
			System.out.println(ex);
		}
		
		//
		try {
			interface1.messageSend(mesaj);
		} catch (RemoteException ex) {
			System.out.println(ex);
		}
		
	}
	
	// main
	public static void main(String[] args) {
		_2_Client client = new _2_Client();
	}
	
}

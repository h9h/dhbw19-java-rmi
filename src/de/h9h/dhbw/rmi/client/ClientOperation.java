package de.h9h.dhbw.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import de.h9h.dhbw.rmi.interface.RMIInterface;

public class ClientOperation {

	private static RMIInterface look_up;

	public static void main(String[] args) 
		throws MalformedURLException, RemoteException, NotBoundException {
		
		look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
			
		int response = look_up.multiply(12, 4);
    System.out.println("Multiplikation performed: 12*4=" + response);
	}
}

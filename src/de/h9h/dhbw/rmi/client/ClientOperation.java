package de.h9h.dhbw.rmi.client;

import de.h9h.dhbw.rmi.rmiinterface.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientOperation {

  public static void main(String[] args)
      throws MalformedURLException, RemoteException, NotBoundException {

    RMIInterface look_up = (RMIInterface) Naming.lookup("MyServer");

    int response = look_up.multiply(12, 4);
    System.out.println("Multiplikation performed: 12*4=" + response);
  }
}

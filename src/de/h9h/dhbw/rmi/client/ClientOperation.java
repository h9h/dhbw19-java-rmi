package de.h9h.dhbw.rmi.client;

import de.h9h.dhbw.rmi.rmiinterface.IArithmetic;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientOperation {

  public static void main(String[] args)
      throws MalformedURLException, RemoteException, NotBoundException {

    IArithmetic arithmetic = (IArithmetic) Naming.lookup("ArithmeticServer");
    System.out.println("Got remote interface " + arithmetic);

    int response = arithmetic.multiply(12, 4);
    System.out.println("Multiplikation performed: 12*4=" + response);
  }
}

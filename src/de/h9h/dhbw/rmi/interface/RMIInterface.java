package de.h9h.dhbw.rmi.interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    public int multiply(int a, int b) throws RemoteException;

}

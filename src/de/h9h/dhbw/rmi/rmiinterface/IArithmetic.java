package de.h9h.dhbw.rmi.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IArithmetic extends Remote {
    Integer multiply(Integer a, Integer b) throws RemoteException;
}

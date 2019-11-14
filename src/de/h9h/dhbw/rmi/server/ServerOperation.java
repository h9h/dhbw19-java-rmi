package de.h9h.dhbw.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import de.h9h.dhbw.rmi.interface.RMIInterface;

public class ServerOperation extends UnicastRemoteObject implements RMIInterface{

    private static final long serialVersionUID = 1L;

    protected ServerOperation() throws RemoteException {
        super();
    }

    @Override
    public int multiply(int a, int b) throws RemoteException{
        System.out.println("Multiply " + a + " and " + b);
        return a * b;
    }

    public static void main(String[] args){
        try {
            Naming.rebind("//localhost/MyServer", new ServerOperation());            
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

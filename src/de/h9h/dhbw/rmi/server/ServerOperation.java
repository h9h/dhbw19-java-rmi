package de.h9h.dhbw.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import de.h9h.dhbw.rmi.rmiinterface.RMIInterface;

public class ServerOperation extends UnicastRemoteObject implements RMIInterface{
    private static final long serialVersionUID = 1L;
    private ServerOperation() throws RemoteException {
        super();
    }

    @Override
    public Integer multiply(Integer a, Integer b){
        System.out.println("Multiply " + a + " and " + b);
        return a * b;
    }

    public static void main(String[] args){
        try {
            Naming.rebind("MyServer", new ServerOperation());
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

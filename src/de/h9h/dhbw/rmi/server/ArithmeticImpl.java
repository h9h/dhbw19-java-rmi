package de.h9h.dhbw.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import de.h9h.dhbw.rmi.rmiinterface.IArithmetic;

public class ArithmeticImpl extends UnicastRemoteObject implements IArithmetic {
    private int counter = 0;
    protected ArithmeticImpl() throws RemoteException {
        super();
        System.out.println("Constructor " + this);
    }

    @Override
    public Integer multiply(Integer a, Integer b){
        this.counter++;
        System.out.println("[" + counter + "] Multiply " + a + " and " + b);
        return a * b;
    }

    public static void main(String[] args){
        try {
            Naming.rebind("ArithmeticServer", new ArithmeticImpl());
            System.out.println("Interface IArithmetic published and bound as ArithmeticServer\nReady");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

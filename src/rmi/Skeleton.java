package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Skeleton extends UnicastRemoteObject implements Stub {

    Skeleton() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return x + y;
    }
}

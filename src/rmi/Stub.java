package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Stub extends Remote {

    int add(int x, int y) throws RemoteException;
}

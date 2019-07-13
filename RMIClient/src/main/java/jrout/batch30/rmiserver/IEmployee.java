package jrout.batch30.rmiserver;


import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IEmployee extends Remote {
    String getEmployeeNameWithId(int id) throws RemoteException;
}


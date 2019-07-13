package jrout.batch30.rmiserver.impl;

import jrout.batch30.rmiserver.IEmployee;
import jrout.batch30.rmiserver.IEmployeeDAO;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EmployeeImpl extends UnicastRemoteObject implements IEmployee , Serializable {
    private static final long serialVersionUID = 1L;
    private IEmployeeDAO employeeDAO = new EmployeeDAOImpl();
    public EmployeeImpl() throws RemoteException {
        super();
    }

    @Override
    public String getEmployeeNameWithId(int id) throws RemoteException {
        System.out.println("Invoking with Id :"+id);
        String name = null;
        String[][] employeeList = employeeDAO.getEmployeeList();
        for(int i = 0 ; i < employeeList.length ; i++) {
            String[] idName = employeeList[i];
            if(Integer.parseInt(idName[0]) == id){
                name = idName[1];
                break;
            }
        }
        return name;
    }
}

package jrout.batch30.rmiserver.impl;

import jrout.batch30.rmiserver.IEmployee;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmployeeClient {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.getRegistry(2345);
        IEmployee employee = (IEmployee)registry.lookup("employee");
        String employeeNameWithId = employee.getEmployeeNameWithId(10);
        System.out.println(employeeNameWithId);
    }
}

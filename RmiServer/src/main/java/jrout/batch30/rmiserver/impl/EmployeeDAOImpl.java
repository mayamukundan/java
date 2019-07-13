package jrout.batch30.rmiserver.impl;

import jrout.batch30.rmiserver.IEmployeeDAO;

public class EmployeeDAOImpl implements IEmployeeDAO {
    @Override
    public String[][] getEmployeeList() {
        String employees[][] = {
                {"10","Peter"}
                ,{"11","Tom"},
                {"12","Jack"},
                {"13","Rayman"}}
                ;
        return employees;
    }
}

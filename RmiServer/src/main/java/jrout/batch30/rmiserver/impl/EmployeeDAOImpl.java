package jrout.batch30.rmiserver.impl;

import jrout.batch30.rmiserver.IEmployeeDAO;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {
    private static Logger logger = Logger.getLogger(EmployeeDAOImpl.class);

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

    @Override
    public List<String> getNames() {
//        String [] namess = {"Peter","Tom","Herb","Ben","Yaman"};
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Tom");
        names.add("Herb");
        names.add("Ben");
        names.add("Yaman");
//        names.add(3456);
        return names;
    }
}

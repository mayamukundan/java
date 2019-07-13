package jrout.batch30.rmiserver.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeDAOImplTest {
    private EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

    @Test
    public void getEmployeeListTest() throws Exception {
        String[][] employeeList = employeeDAO.getEmployeeList();
        assertNotNull(employeeList);
    }
}
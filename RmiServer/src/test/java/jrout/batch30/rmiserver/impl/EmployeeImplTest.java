package jrout.batch30.rmiserver.impl;

import jrout.batch30.rmiserver.IEmployee;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeImplTest {

    @Test
    public void getEmployeeNameWithIdTest() throws Exception {
        IEmployee employee = new EmployeeImpl();
        String employeeNameWithId = employee.getEmployeeNameWithId(10);
        assertEquals("Peter",employeeNameWithId);
    }

    @Ignore
    public void getSomething() throws Exception {

    }
}
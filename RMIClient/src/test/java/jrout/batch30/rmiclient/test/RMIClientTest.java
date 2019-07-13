package jrout.batch30.rmiclient.test;
import jrout.batch30.rmiserver.IEmployee;
import org.junit.Test;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import static org.junit.Assert.*;

public class RMIClientTest {

    @Test
    public void testRMIClient() throws Exception {
        Registry registry = LocateRegistry.getRegistry(2345);
        IEmployee employee = (IEmployee)registry.lookup("employee");
        String employeeNameWithId = employee.getEmployeeNameWithId(13);
        System.out.println(employeeNameWithId);
    }
}

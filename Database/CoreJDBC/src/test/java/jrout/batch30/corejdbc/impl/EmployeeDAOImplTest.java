package jrout.batch30.corejdbc.impl;

import jrout.batch30.corejdbc.IEmployeeDAO;
import jrout.batch30.corejdbc.domain.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class EmployeeDAOImplTest {
    private IEmployeeDAO iEmployeeDAO;

    @Before
    public void setUp() throws Exception {
        iEmployeeDAO = new EmployeeDAOImpl(); // this is a dependency for this class.
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fetchFirstNameUsingIdTest() throws Exception {
        String firstName = iEmployeeDAO.fetchFirstNameUsingId(10009);
        assertNotNull(firstName);
    }

    @Test
    public void fetchEmployeeWithFirstNameTest() throws Exception {
        List<Employee> employeeList = iEmployeeDAO.fetchEmployeeWithFirstName("Parto");
        assertNotNull(employeeList);
        assertTrue(employeeList.size() > 0);
        List<Employee> finalList = new ArrayList<>();

//        employeeList.stream().forEach(System.out::print);
        /*for(Employee employee : employeeList){
            if(employee.getLastName().startsWith("Gi")){
                finalList.add(employee);
            }
            //System.out.println(employee.getFirstName() +"  "+ employee.getLastName());
        }*/


        /*for(Employee employee : finalList) {
            System.out.println(employee.getFirstName() +"  "+ employee.getLastName());
        }*/

//        List<Employee> gi = employeeList.stream()
//                .filter(obj -> obj.getLastName().startsWith("Gi"))
//                .collect(Collectors.toList());
//
        employeeList.stream()
                .filter(obj -> obj.getLastName().startsWith("Gi"))
                .filter(obj -> obj.getLastName().endsWith("e"))
                .collect(Collectors.toList())
                .forEach(obj -> System.out.println(obj.getFirstName() +" "+ obj.getLastName()));
    }
}
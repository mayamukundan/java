package jrout.batch30.rmiserver.impl;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeDAOImplTest {
    private EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

    @Test
    public void getEmployeeListTest() throws Exception {
        String[][] employeeList = employeeDAO.getEmployeeList();
        assertNotNull(employeeList);
    }

    @Test
    public void getNamesStartWithTest()throws Exception {
        List<String> names = employeeDAO.getNames();
        names.add("Jayram");

        System.out.println("All Name : "+names);
        System.out.println("Size : "+ names.size());
        names.remove("Peter");

        System.out.println("All Name after removing : "+names);

        names.clear();

        System.out.println("All Name after clearning : "+names);

        /*for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }*/
        /*for(String name : names) {
            System.out.println(name);
        }*/

//        names.forEach(System.out::println);

        assertNotNull(names);
    }

    @Test
    public void getNamesStartWithTest_2()throws Exception {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Tom");
        names.add("Herb");
        names.add("Ben");
        names.add("Yaman");
        System.out.println(names);
        names.add(2,"**********");
        System.out.println(names);
        assertNotNull(names);
    }
}
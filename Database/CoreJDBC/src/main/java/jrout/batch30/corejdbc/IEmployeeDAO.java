package jrout.batch30.corejdbc;

import jrout.batch30.corejdbc.domain.Employee;

import java.util.List;

public interface IEmployeeDAO {
    String fetchFirstNameUsingId(int empId);

    List<Employee> fetchEmployeeWithFirstName(String firstName);
}

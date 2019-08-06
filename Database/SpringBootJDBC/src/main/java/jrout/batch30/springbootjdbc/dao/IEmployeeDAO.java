package jrout.batch30.springbootjdbc.dao;

import jrout.batch30.springbootjdbc.domain.Employee;

import java.util.List;

public interface IEmployeeDAO {
    String fetchFirstNameUsingId(int empId);
    List<Employee> fetchEmployeeWithFirstName(String firstName);

    Employee getEmployeeDetails(int empId);
}

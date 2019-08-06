package jrout.batch30.springbootjdbc.dao.impl;

import jrout.batch30.springbootjdbc.dao.IEmployeeDAO;
import jrout.batch30.springbootjdbc.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String fetchFirstNameUsingId(int empId) {
        String sql = "select first_name from employees where emp_no = ?";
//        String firstName = jdbcTemplate.queryForObject(sql, new Object[]{empId}, String.class);
        String firstName = jdbcTemplate.queryForObject(sql, new Object[]{empId}, String.class);
        return firstName;
    }

    @Override
    public List<Employee> fetchEmployeeWithFirstName(String firstName) {
//        String s = jdbcTemplate.queryForObject("select * from employees where first_name = ?", String.class);
//        System.out.println(s);

        return null;
    }

    /*@Override
    public Employee getEmployeeDetails(int empId) {
        String qry = "select * from employees where emp_no = ? ";
        Map employeeMap = jdbcTemplate.queryForMap(qry, new Object[]{empId});
        Object emp_no = employeeMap.get("emp_no");

        System.out.println(employeeMap);
        Employee employee = new Employee();
        employee.setEmpNo((Integer)emp_no); // int Integer
        employee.setFirstName((String)employeeMap.get("first_name"));
        return employee;
    }*/

   /* @Override
    public Employee getEmployeeDetails(int empId) {
        String qry = "select * from employees where emp_no = ? ";
        List<Employee> query = jdbcTemplate.query(qry, new Object[]{empId}, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setEmpNo(resultSet.getInt("emp_no"));
                employee.setDob(resultSet.getDate("birth_Date"));
                employee.setFirstName(resultSet.getString("first_name"));
                return employee;
            }
        });
        return query.get(0);
    }*/

    @Override
    public Employee getEmployeeDetails(int empId) {
        String qry = "select * from employees where emp_no = ? ";
        List<Employee> query = jdbcTemplate.query(qry, new Object[]{empId},
                (resultSet, i) -> {
            Employee employee = new Employee();
            employee.setEmpNo(resultSet.getInt("emp_no"));
            employee.setDob(resultSet.getDate("birth_Date"));
            employee.setFirstName(resultSet.getString("first_name"));
            return employee;
        }
        );
        return query.get(0);
    }
}

/*class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmpNo(resultSet.getInt("emp_no"));
        employee.setDob(resultSet.getDate("birth_Date"));
        employee.setFirstName(resultSet.getString("first_name"));
        return employee;
    }
}*/

package jrout.batch30.springbootjdbc.dao.impl;

import jrout.batch30.springbootjdbc.dao.IEmployeeDAO;
import jrout.batch30.springbootjdbc.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//@Component
public class EmployeeDAOImplBK implements IEmployeeDAO {

    @Autowired
    private DataSource dataSource;

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Override
    public String fetchFirstNameUsingId(int empId) {
        String firstName = null;
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("select first_name from employees where emp_no = ?");
            statement.setInt(1,empId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                firstName = resultSet.getString("first_name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return firstName;
    }

    @Override
    public List<Employee> fetchEmployeeWithFirstName(String firstName) {
//        String s = jdbcTemplate.queryForObject("select * from employees where first_name = ?", String.class);
//        System.out.println(s);

        return null;
    }

    @Override
    public Employee getEmployeeDetails(int empId) {
        return null;
    }
}

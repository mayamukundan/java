package jrout.batch30.corejdbc.impl;

import com.mysql.cj.jdbc.Driver;
import jrout.batch30.corejdbc.IEmployeeDAO;
import jrout.batch30.corejdbc.domain.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {

//    4 Steps to connect to DB.
//    Import JDBC Packages
//    Register JDBC Driver
//    Class.forName()
//    Driver myDriver = new oracle.jdbc.driver.OracleDriver(); 	DriverManager.registerDriver( myDriver );
//    Database URL Formulation
//    Create Connection Object
    String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection connection = null;
    static {
        try {
//            Driver driver = new Driver();
//            DriverManager.registerDriver(driver);
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(url,"root","root");
                System.out.println("Connection Established...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public String fetchFirstNameUsingId(int empId) {
        String firstName = null;
        //   String url = "jdbc:oracle:thin:@localhost:1521/XE";

        try {
            connection = getConnection();
//            Statement statement = connection.createStatement();

//            ResultSet resultSet = statement.executeQuery("select first_name from employees where emp_no = 10009");
            PreparedStatement statement = connection.prepareStatement("select first_name from employees where emp_no = ?");
            statement.setInt(1,10009);
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

        System.out.println(firstName);
        return firstName;
    }

    public List<Employee> fetchEmployeeWithFirstName(String firstName) {
        List<Employee> employeeList = new ArrayList<Employee>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = getConnection();
            preparedStatement = connection.prepareStatement("select * from employees where first_name = ?");
            preparedStatement.setString(1,firstName);

            resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()){
                employee = new Employee();
                employee.setEmpNo(Integer.parseInt(resultSet.getString("emp_no")));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                //employee.setGender((char)resultSet.getString("gender"));
                employeeList.add(employee);
            }
        }catch (Exception sqlException) {
            sqlException.printStackTrace();
        }finally {
            closeConnections(resultSet,preparedStatement,connection);
        }
        return employeeList;
    }

    /**
     * API to close all open connections.
     */
    private void closeConnections(ResultSet rs, Statement stmt, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}

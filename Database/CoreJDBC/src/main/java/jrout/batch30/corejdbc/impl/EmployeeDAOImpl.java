package jrout.batch30.corejdbc.impl;

import com.mysql.cj.jdbc.Driver;
import jrout.batch30.corejdbc.IEmployeeDAO;
import java.sql.*;

public class EmployeeDAOImpl implements IEmployeeDAO {

//    4 Steps to connect to DB.
//    Import JDBC Packages
//    Register JDBC Driver
//    Class.forName()
//    Driver myDriver = new oracle.jdbc.driver.OracleDriver(); 	DriverManager.registerDriver( myDriver );
//    Database URL Formulation
//    Create Connection Object

    public String fetchFirstNameUsingId(int empId) {
        String firstName = null;
//      Driver myDriver = new oracle.jdbc.driver.OracleDriver(); 	DriverManager.registerDriver( myDriver );

        try {
//            Driver driver = new Driver();
//            DriverManager.registerDriver(driver);
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        String url = "jdbc:mysql://localhost:3306/employees?useOldAliasMetadataBehavior=true&useUnicode=true&characterEncoding=UTF-8";
        String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        //   String url = "jdbc:oracle:thin:@localhost:1521/XE";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,"root","root");
            System.out.println("Connection Established...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select first_name from employees where emp_no = 10009");
            while (resultSet.next()){
                firstName = resultSet.getString("first_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(firstName);
        return firstName;
    }
}

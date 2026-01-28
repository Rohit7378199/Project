package com.org;
import java.sql.*;
import java.util.ArrayList;

public class EmployeeDao {
    public static void createEmployee(Employee employee) throws SQLException {
        Connection conn=DB.connect();
        String query= Query.insert;
        PreparedStatement preparedStatement=conn.prepareStatement(query);
        preparedStatement.setInt(1,employee.getId());
        preparedStatement.setString(2,employee.getName());
        preparedStatement.setString(3,employee.getEmail());
        preparedStatement.setInt(4,employee.getSalary());

        System.out.println("\n ps = "+preparedStatement);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public static void updateEmployee(int id,String name) throws SQLException {
        Connection conn=DB.connect();
        String query= Query.update;
        PreparedStatement preparedStatement=conn.prepareStatement(query);
        preparedStatement.setInt(2,id);
        preparedStatement.setString(1,name);

        System.out.println("\n ps = "+preparedStatement);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }


    public static ArrayList<Employee> readAllEmployee() throws SQLException {
        ArrayList<Employee> emplist=new ArrayList<Employee>();
        Connection conn=DB.connect();
        String query= Query.select;
        Statement statement = conn.createStatement();
        System.out.println("\n st = "+statement);
        ResultSet rs = statement.executeQuery(query);

        while (rs.next()){
            Employee emp =new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            emplist.add(emp);
        }
        statement.close();
        return emplist;
    }

    public static void deleteEmployee(int id) throws SQLException {
        Connection conn=DB.connect();
        String query= Query.delete;
        PreparedStatement preStatement=conn.prepareStatement(query);
        preStatement.setInt(1,id);
        System.out.println("\n st = "+preStatement);
        preStatement.execute();
        preStatement.close();

    }
}

package com.org;
import java.sql.*;
import java.util.ArrayList;

public class StudentDao {
    public static void createEmployee(Student student) throws SQLException {
        Connection conn=DB.connect();
        String query= Query.insert;
        PreparedStatement preparedStatement=conn.prepareStatement(query);
        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getEmail());
        preparedStatement.setInt(4, student.getSalary());

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


    public static ArrayList<Student> readAllEmployee() throws SQLException {
        ArrayList<Student> emplist=new ArrayList<Student>();
        Connection conn=DB.connect();
        String query= Query.select;
        Statement statement = conn.createStatement();
        System.out.println("\n st = "+statement);
        ResultSet rs = statement.executeQuery(query);

        while (rs.next()){
            Student emp =new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
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

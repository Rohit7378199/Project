package com.org;

public class Query {
    static String insert="insert into student (id ,name,email,salary) values(?,?,?,?)";
    static String update="update student set name = ? where id = ? ";
    static String delete="DELETE FROM student WHERE id=?";
    static String select="select * from student";


}

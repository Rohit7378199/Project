package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    static Connection conn = null;

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "Rohitpetale@123";
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}

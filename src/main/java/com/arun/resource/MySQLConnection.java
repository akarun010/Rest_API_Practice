package com.arun.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/student_api";
        String password = "root";
        String user = "root";

        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

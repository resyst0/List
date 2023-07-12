package com.example.list;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connectDatabase() throws SQLException, ClassNotFoundException {
        String dbDriver="com.mysql.cj.jdbc.Driver";
        String dbURl="jdbc:mysql://localhost:3306/";

        String dbName="announcements";
        String dbUsername="root";
        String dbPassword="";

        Class.forName(dbDriver);
        Connection connection= DriverManager.getConnection(dbURl + dbName,dbUsername,dbPassword);
        return connection;

    }
}

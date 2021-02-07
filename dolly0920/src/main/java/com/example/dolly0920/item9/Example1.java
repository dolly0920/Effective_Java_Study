package com.example.dolly0920.item9;

import java.sql.*;

public class Example1 {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    String driverName = "oracle.jdbc.driver.OracleDriver";
    String url = "oracle:thin:localhost:xxxx";
    String user = "chickenrun";
    String password = "chicchic";

    public Example1() {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("[load error]\n" + e.getStackTrace());
        } catch (SQLException e) {
            System.out.println("[connection error]\n" + e.getStackTrace());
        } finally { // if there is a error in 'finally', close method may not work normally.
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                System.out.println("[close error]\n" + e.getStackTrace());
            }
        }
    }
}

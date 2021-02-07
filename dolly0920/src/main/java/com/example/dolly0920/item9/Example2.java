package com.example.dolly0920.item9;

import java.sql.*;

public class Example2 {
    String driverName = "oracle.jdbc.driver.OracleDriver";
    String url = "oracle:thin:localhost:xxxx";
    String user = "chickenrun";
    String password = "chicchic";

    // try with resource
    public Example2() {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.prepareStatement("select * from member");
             ResultSet resultSet = statement.getResultSet();    // resources
        ){
            Class.forName(driverName);
            String name = resultSet.getString(1);
            System.out.println("회원명 : " + name);

        } catch (ClassNotFoundException e) {
            System.out.println("[로드 오류]\n" + e.getStackTrace());
        } catch (SQLException e) {
            System.out.println("[연결 오류]\n" + e.getStackTrace());
        }
    }
}

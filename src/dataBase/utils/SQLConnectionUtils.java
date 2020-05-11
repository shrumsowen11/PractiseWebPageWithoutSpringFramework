package dataBase.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLConnectionUtils {
    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/keubiko_db";
    private static String username="root";
    private static String password="";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,username, password);

        if (conn != null){
            System.out.println("Connection Established...!!!");
        }
        return conn;
    }
}

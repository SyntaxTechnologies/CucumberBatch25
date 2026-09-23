package runners;

import java.sql.*;
import java.util.Stack;

public class DBDEMO {

    public static void main(String[] args) throws SQLException {

       String dbURL="jdbc:mysql://148.72.132.33:3307/syntax_hrm";
        String dbUserName="syntax_std";
        String dbPassword="syntax_std@2026";

        Connection connection = DriverManager.getConnection(dbURL,dbUserName,dbPassword);
        Statement statement = connection.createStatement();
        String query = "Select * from person";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
    }
}

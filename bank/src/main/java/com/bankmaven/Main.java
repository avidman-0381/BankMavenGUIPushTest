package com.bankmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) throws Exception {
        
        // Create inputs for Account obj
        List<String> secQuestions = Arrays.asList("What is your favorite computer?", "What is this?");
        
        // Account obj
        Account test = new Account(101, 1001230, "Jeff", "jrgsfdgfsdgbeff@gmail.com", secQuestions);
        
        // User
        DateOfBirth dob = new DateOfBirth(15, 12, 2000);
        User user = new User(test, dob);
        
        Account userAcc = user.getAccount();
        
        int balances = userAcc.getBalance();
        
        final String driverURL = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(driverURL);

        final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=Users;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
        Connection conn;    
        //System.setProperty("java.library.path", "C:/Users/magsu/Downloads/sqljdbc_13.6.0.0_enu/sqljdbc_13.6/enu/auth/x64"); // Replace with your actual folder path containing the DLL
        conn = DriverManager.getConnection(DB_URL);

        Statement stmt = conn.createStatement();
        String insert = "SELECT * FROM UserInfo";
        String insertData = "INSERT INTO UserInfo (id, balance, ownerName, email, DoB) VALUES (?, ?, ?, ?, ?)";
        
        java.sql.PreparedStatement ps = conn.prepareStatement(insertData);
        ps.setInt(1, userAcc.getID());
        ps.setInt(2, userAcc.getBalance());
        ps.setString(3, userAcc.getOwnerName());
        ps.setString(4, userAcc.getEmail());
        ps.setString(5, user.getDoB().forTest());
        ps.executeUpdate();

        java.sql.ResultSet rs = stmt.executeQuery(insert);
        java.sql.ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Loop through every row
        while (rs.next()) {
        // Loop through every column in the current row
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            String columnValue = rs.getString(i);
            System.out.print(columnName + ": " + columnValue + "  ");
        }
        System.out.println(); // Moves to the next line for the next row
        }

        rs.close();
        stmt.close();
        conn.close();


    }
}
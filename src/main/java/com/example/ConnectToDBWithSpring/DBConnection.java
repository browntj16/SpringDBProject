package com.example.ConnectToDBWithSpring;

import java.sql.*;

import org.springframework.stereotype.Component;

@Component
public class DBConnection {
    private Connection connection;

    public DBConnection(Connection connection){
        this.connection = connection;
    }

    /**
     * Since I'm just testing with Spring I'm just reusing a table from a previous project. Anyways, I just want to make a basic
     * function that grabs something from the database to test our connection.
     */
    public void accessEmailsTable(){
        try{
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT email FROM sys.emails");
            while(rs.next()){
                System.out.println(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }


    }


}

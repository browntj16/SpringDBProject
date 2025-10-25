package com.example.ConnectToDBWithSpring;

import java.sql.*;

import org.springframework.stereotype.Component;

@Component
public class DBConnection {
    private String userName;
    private String password;

    public DBConnection(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}

package com.example.ConnectToDBWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ConnectToDbWithSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConnectToDbWithSpringApplication.class, args);
		DBConnection conn = context.getBean(DBConnection.class);
		conn.accessEmailsTable();

	}

	/**
	 * can return null if exception occurs
	 * @return
	 */
	@Bean
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:free", "c##browntj16", "Foofighters95");

	}

}

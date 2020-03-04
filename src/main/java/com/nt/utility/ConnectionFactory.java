package com.nt.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection con = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
}

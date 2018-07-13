package com.mahendra.dao;

//JDBC API from package java.sql
import java.sql.*;

public class ConnectionUtil {
	private static final String URL="jdbc:oracle:thin:@192.168.56.204:1521/xe";
	private static final String USER="hr";
	private static final String PASSWORD="hr";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
		//Step1 : Load Oracle Driver
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("--- Driver loaded ---");
		//Step2 : Connect with database
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("--- Connected to Database ---");
		}catch(ClassNotFoundException | SQLException ex) {
			System.out.println("Unable to connect!");
			System.out.println(" >>"+ex.getMessage());
		}
		return con;
	}
}

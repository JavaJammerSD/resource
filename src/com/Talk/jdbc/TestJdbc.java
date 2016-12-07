package com.Talk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/reservation?useSSL=false";
		String user = "resource1";
		String pass = "resource1";
		try{
			
			
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myCon =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("success!!!!");
			
			
			
		}
		catch(Exception exc){
			
			exc.printStackTrace();
		}

	}

}

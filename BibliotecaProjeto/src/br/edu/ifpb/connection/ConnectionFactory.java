package br.edu.ifpb.connection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
	
	public Connection getConnection() {
		
	     try {
	         return DriverManager.getConnection(
	        		 "jdbc:mysql://localhost/BIBLIOTECA","root","");
	     } catch (SQLException e) {
	    	 System.out.println("não foi");
	         throw new RuntimeException(e);
	     }
	 }
}
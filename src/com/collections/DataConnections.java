package com.collections;
import java.sql.*;

public class DataConnections {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		System.out.println("connection Successfull");
				
	

	}

}

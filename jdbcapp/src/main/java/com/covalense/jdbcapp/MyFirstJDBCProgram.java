package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class MyFirstJDBCProgram {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1.Load the "Driver"

			/*
			 * Driver driver=new Driver(); DriverManager.registerDriver(driver);
			 */

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();// for 8th version of mysql connector

			// 2.Get the "DB connection" via driver

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=password";

			con = DriverManager.getConnection(dbUrl);
	 		log.info("Connection impl class: " + con.getClass());

			// 3.Issue "sql queries" via "connection"

			String query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			// 4."Process the results" returned by "sql queries"
			while (rs.next()) {
				log.info("ID  	             =====> " + rs.getInt("ID"));
				log.info("NAME  			 =====> " + rs.getString("NAME"));
				log.info("AGE				 =====> " + rs.getInt("AGE"));
				log.info("GENDER			 =====> " + rs.getString("GENDER"));
				log.info("SALARY			 =====> " + rs.getDouble("SALARY"));
				log.info("PHONE			     =====> " + rs.getLong("PHONE"));
				log.info("JOINING_DATE		 =====> " + rs.getDate("JOINING_DATE"));
				log.info("ACCOUNT_NUMBER	 =====> " + rs.getLong("ACCOUNT_NUMBER"));
				log.info("EMAIL			 	 =====> " + rs.getString("EMAIL"));
				log.info("DESIGNATION		 =====> " + rs.getString("DESIGNATION"));
				log.info("DOB     			 =====> " + rs.getDate("DOB"));
				log.info("DEPT_ID	         =====> " + rs.getInt("DEPT_ID"));
				log.info("MNGR_ID			 =====> " + rs.getInt("MNGR_ID"));

			} // End of while

		} catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			// 5.Close all "JDBC objects
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} // End of Try-Catch block
		}

	}// End of method

}// End of class

package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class JdbcProgramForAWSDB {

	public static void main(String[] args) {

		String query = "select * from employee_info";
		String dbUrl = "jdbc:mysql://aws-mysql.cctieuzchhty.ap-south-1.rds.amazonaws.com\r\n:3306/mysqldb?user=root&password=12345678";
		log.info(dbUrl);

		try (Connection con = DriverManager.getConnection(dbUrl); //try with resources..no need no close them manually
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery(query);) {
			
			// 1.Load the "Driver"

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();// for 8th version of mysql connector

			// 2.Get the "DB connection" via driver

			log.info("Connection impl class: " + con.getClass());

			// 3.Issue "sql queries" via "connection"

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
		} //End of try-catch
	}// End of main

}// End of class

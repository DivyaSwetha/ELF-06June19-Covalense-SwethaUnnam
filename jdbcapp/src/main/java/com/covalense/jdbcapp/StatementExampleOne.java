package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExampleOne {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=password";

			con = DriverManager.getConnection(dbUrl);

			String query = "insert into employee_info values"
					+ " (12,'Mani',22,'female',21000.0,9876545678,'2018-06-30',12456809,'mani@gmail.com','Test engineer','1997-02-03',17,111)";
			stmt = con.createStatement();
			int result = stmt.executeUpdate(query);
			log.info("rows effected: " + result);

		} catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} // End of Try-Catch block
		}

	}// End of method

}// End of class

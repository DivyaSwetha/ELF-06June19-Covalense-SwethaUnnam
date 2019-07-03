package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class ConnectionPoolTest {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;

		try {
			pool =ConnectionPool.getConnectionPool();
			
			  con = pool.getConnectionFromPool();
			 
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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.Close all "JDBC objects
			try {

				pool.returnConnectionToPool(con);
				/*
				 * if (con != null) { con.close(); }
				 */
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

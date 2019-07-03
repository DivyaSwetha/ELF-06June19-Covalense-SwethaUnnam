package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class InsertIntoAWSDB {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int c=0;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://aws-mysql.cctieuzchhty.ap-south-1.rds.amazonaws.com\r\n" + 
					":3306/mysqldb?user=root&password=12345678";

			con = DriverManager.getConnection(dbUrl);

			String query = "insert into employee_info values" + " (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			pstmt.setDouble(5, Double.parseDouble(args[4]));
			pstmt.setLong(6, Long.parseLong(args[5]));
			pstmt.setString(7, args[6]);
			pstmt.setLong(8, Long.parseLong(args[7]));
			pstmt.setString(9, args[8]);
			pstmt.setString(10, args[9]);
			pstmt.setString(11, args[10]);
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));

			int result = pstmt.executeUpdate();
			log.info("rows effected: " + result);

		} catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} // End of Try-Catch block
		}

	}// End of method

}// End of class

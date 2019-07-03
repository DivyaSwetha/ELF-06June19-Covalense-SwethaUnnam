package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;
import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.POOL_SIZE;
import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.DB_URL;
import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.USERNAME;
import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.PASSWORD;
import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.DRIVER_NAME;

public class ConnectionPool {

	private Vector<Connection> pool = null;
	private Connection con = null;
	private static ConnectionPool poolRef;
	private int poolSize;
	private String dbUrl;
	private String userName;
	private String password;
	private String driverClassNm;

	private void loadProperties() throws Exception {

		poolSize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(POOL_SIZE));
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(DB_URL);
		userName = PropertyUtil.getPropertyUtil().getProperty(USERNAME);
		password = PropertyUtil.getPropertyUtil().getProperty(PASSWORD);
		driverClassNm = PropertyUtil.getPropertyUtil().getProperty(DRIVER_NAME);

	}

	private void intializePool() throws Exception {
		pool = new Vector<Connection>();
		Connection con = null;
		Class.forName(driverClassNm);

		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, userName, password);
			pool.add(con);
		} // End of for
	}

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private ConnectionPool() throws Exception {

		loadProperties();
		intializePool();

	}// End of constructor

	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

}// End of class

package com.createiq.test;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class DBCP2Demo {

	private static BasicDataSource dataSource = null;

	static {
		dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/productcatalog?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setMinIdle(5);
		dataSource.setMaxIdle(10);
		dataSource.setMaxTotal(25);
	}

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			System.out.println(connection);
		} finally {
			connection.close();
		}

	}
}

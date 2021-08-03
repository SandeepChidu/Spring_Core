package com.createiq.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPDemo {

	private static HikariDataSource dataSource = null;

	static {

		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/productcatalog");
		config.setUsername("root");
		config.setPassword("root");
		config.addDataSourceProperty("minimumIdle", "6");
		config.addDataSourceProperty("maximumPoolSize", "30");
		
		dataSource=new HikariDataSource(config);
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

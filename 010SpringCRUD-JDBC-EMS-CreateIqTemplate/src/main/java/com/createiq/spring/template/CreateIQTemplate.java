package com.createiq.spring.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

	public class CreateIQTemplate {

		private DataSource dataSource;

		public CreateIQTemplate(DataSource dataSource) {
			super();
			this.dataSource = dataSource;
		}

		public int update(String sql, Object... objects) {
			Connection connection = null;
			PreparedStatement statement = null;

			try {
				connection = dataSource.getConnection();
				statement = connection.prepareStatement(sql);
				for (int i = 0; i < objects.length; i++) {
					statement.setObject(i + 1, objects[i]);
				}

				return statement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return 0;
		}

	}


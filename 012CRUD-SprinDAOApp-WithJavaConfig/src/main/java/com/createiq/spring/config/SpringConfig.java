package com.createiq.spring.config;

import javax.xml.bind.annotation.XmlEnumValue;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@PropertySource(value = {"db.properties"})
@ComponentScan(basePackages ="com.createiq")
public class SpringConfig {
	@Autowired
	public Environment env;
	@Bean
	public BasicDataSource basicDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(env.getProperty("url"));
		basicDataSource.setUsername(env.getProperty("uname"));
		basicDataSource.setPassword(env.getProperty("password"));
		return basicDataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(basicDataSource());

	}
}

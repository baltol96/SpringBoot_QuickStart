package com.example.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.jdbc.util.JDBCConnectionManager;

@Configuration
public class BoardAutoConfiguration {
	
	@Bean
	public JDBCConnectionManager getJDBCConnectionManager() {
		JDBCConnectionManager manager = new JDBCConnectionManager();
		manager.setDriverClass("oracle.jdbc.driver.OracleDriver");
		manager.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		manager.setUsername("example");
		manager.setPassword("example");
		return manager;
	}
}

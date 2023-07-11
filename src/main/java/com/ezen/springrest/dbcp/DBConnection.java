package com.ezen.springrest.dbcp;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBConnection {
	
	public static HikariDataSource getDataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
		config.setUsername("hr");
		config.setPassword("1234");
		return new HikariDataSource(config);
	}
}

package com.zhuyifeng.gjp.tools;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class JDBCUtils {
	
private static BasicDataSource datasource = new BasicDataSource();
	
	static {
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/gjp?useSSL=false");
		datasource.setUsername("root");
		datasource.setPassword("madfrog1");
		datasource.setMaxTotal(10);
		datasource.setMaxIdle(5);
		datasource.setMinIdle(1);
		datasource.setInitialSize(10);
	}
	
	public static DataSource getDatasource() {
		return datasource;
	}

}

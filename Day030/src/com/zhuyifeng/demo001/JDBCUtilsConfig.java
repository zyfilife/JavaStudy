package com.zhuyifeng.demo001;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class JDBCUtilsConfig {

	private static Connection con;
	private static String driverClass;
	private static String password;
	private static String database;
	private static String user;
	private static String url;

	static {
		try {
			readProperties();
			Class.forName(driverClass);
			con = JDBCUtil.getCon(url, database, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void readProperties() throws IOException {
		InputStream is = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		var pro = new Properties();
		pro.load(is);
		driverClass = pro.getProperty("driverClass");
		password = pro.getProperty("password");
		database = pro.getProperty("database");
		user = pro.getProperty("user");
		url = pro.getProperty("url");
	}

	public static Connection getConnection() {
		return con;
	}

}

package com.zhuyifeng.demo001;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DatasourceDemo {
	
	public static void main(String[] args) {
		var bd = new BasicDataSource();
		bd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bd.setUrl("jdbc:mysql://localhost:3306/my_data_base?useSSL=false");
		bd.setUsername("root");
		bd.setPassword("madfrog1");
		try {
			Connection con = bd.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

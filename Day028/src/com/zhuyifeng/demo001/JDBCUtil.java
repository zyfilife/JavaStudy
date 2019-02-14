package com.zhuyifeng.demo001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	
	private static Connection con;
	
	private JDBCUtil() {
	}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(JDBCDemo.url+JDBCDemo.database, JDBCDemo.user, JDBCDemo.password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("注册数据库失败");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("连接数据库失败");
		}
	}

	public static Connection getCon() {
		return con;
	}
	
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

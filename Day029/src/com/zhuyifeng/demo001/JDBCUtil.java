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

	public static Connection getCon(String url, String database, String user, String password) {

		try {
			con = DriverManager.getConnection(url+database, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("连接数据库失败");
		}
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

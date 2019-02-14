package com.zhuyifeng.demo001;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		function1();
	}
	
//	static void function0() {
//		var con = JDBCUtil.getCon();
//		PreparedStatement s = null;
//		ResultSet r = null;
//		List<User> list = new ArrayList<User>();
//		try {
//			s = con.prepareStatement("SELECT * FROM users");
//			r = s.executeQuery();
//			while (r.next()) {
//				var u = new User(r.getInt("id"), r.getString("uname"), r.getString("address"), r.getString("u_password"));
//				list.add(u);
//			}
//			System.out.println(list);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		JDBCUtil.close(con, s, r);
//	}
	
	static void function1() {
		var in = Test.class.getClassLoader().getResourceAsStream("database.properties");
		System.out.println(in);
		var pro = new Properties();
		try {
			pro.load(in);
			String driverClass = pro.getProperty("driverClass");
			String password = pro.getProperty("password");
			String database = pro.getProperty("database");
			String user = pro.getProperty("user");
			String url = pro.getProperty("url");
			try {
				Class.forName(driverClass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			var con = JDBCUtil.getCon(url, database, user, password);
			var s = con.prepareStatement("SELECT * FROM book");
			var r = s.executeQuery();
			while (r.next()) {
				System.out.println(r.getString("zname"));
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

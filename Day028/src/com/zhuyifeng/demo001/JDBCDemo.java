package com.zhuyifeng.demo001;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {
	static final String user = "root";
	static final String password = "madfrog1";
	static final String url = "jdbc:mysql://localhost:3306/";
	static final String database = "my_data_base?useSSL=false";
	
	public static void main(String[] args) {
//		function0();
//		function1();
//		function2("abc", "111");
//		function3("abc", "111");
//		function4();
		function5();
	}
	
	static void function0() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			var c = DriverManager.getConnection(JDBCDemo.url+JDBCDemo.database, JDBCDemo.user, JDBCDemo.password);
			System.out.println(c);
			var s = c.createStatement();
			var sql = "INSERT INTO book (zname, money) VALUES ('购物支出',5599.99)";
			var row = s.executeUpdate(sql);
			System.out.println(row);
			s.close();
			c.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("注册驱动失败");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接数据库失败");
			e.printStackTrace();
		}
	}
	
	static void function1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			var c = DriverManager.getConnection(JDBCDemo.url+JDBCDemo.database, JDBCDemo.user, JDBCDemo.password);
			System.out.println(c);
			var s = c.createStatement();
			var sql0 = "SELECT * FROM book";
			var r = s.executeQuery(sql0);
			System.out.println(r);
			while (r.next()) {
				System.out.println("zname: "+r.getString("zname")+"     money: "+r.getDouble("money"));
			}
			r.close();
			s.close();
			c.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("注册驱动失败");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接数据库失败");
			e.printStackTrace();
		}
	}
	
	static void function2(String name, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			var c = DriverManager.getConnection(JDBCDemo.url+JDBCDemo.database, JDBCDemo.user, JDBCDemo.password);
			System.out.println(c);
			var s = c.createStatement();
			var sql = "SELECT * FROM users WHERE uname = '"+name+"' AND u_password = '"+password+"'";
			var r = s.executeQuery(sql);
			System.out.println(r);
			if (r.next()) {
				System.out.println("登录成功");
			}else {
				System.out.println("登录失败");
			}
			r.close();
			s.close();
			c.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void function3(String name, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			var c = DriverManager.getConnection(JDBCDemo.url+JDBCDemo.database, JDBCDemo.user, JDBCDemo.password);
			System.out.println(c);
			var sql = "SELECT * FROM users WHERE uname=? AND u_password=?";
			var s = c.prepareStatement(sql);
			s.setObject(1, name);
			s.setObject(2, password);
			var r = s.executeQuery();
			System.out.println(r);
			if (r.next()) {
				System.out.println("登录成功");
			}else {
				System.out.println("登录失败");
			}
			r.close();
			s.close();
			c.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void function4() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			var c = DriverManager.getConnection(JDBCDemo.url+JDBCDemo.database, JDBCDemo.user, JDBCDemo.password);
			System.out.println(c);
			var sql = "UPDATE book SET zname = ?, money = ? WHERE id = ?";
			var s = c.prepareStatement(sql);
			s.setObject(1, "游戏支出");
			s.setObject(2, 1024);
			s.setObject(3, 2);
			s.executeUpdate();
			s.close();
			c.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void function5() {
		Connection con = JDBCUtil.getCon();
		PreparedStatement s = null;
		ResultSet r = null;
		try {
			s = con.prepareStatement("SELECT * from book");
			r = s.executeQuery();
			while (r.next()) {
				System.out.println(r.getString("zname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtil.close(con, s, r);
	}
}

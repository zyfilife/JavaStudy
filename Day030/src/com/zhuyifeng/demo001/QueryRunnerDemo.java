package com.zhuyifeng.demo001;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class QueryRunnerDemo {
	
	private static Connection con = JDBCUtilsConfig.getConnection();

	public static void main(String[] args) {
		function10();
	}
	
	public static void function0() {
		QueryRunner qr = new QueryRunner();
		var sql = "INSERT INTO book (zname, money) VALUES(?, ?)";
		try {
			var row = qr.update(con, sql, "购物支出", 100001);
			System.out.println(row);
			DbUtils.closeQuietly(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function1() {
		QueryRunner qr = new QueryRunner();
		var sql = "UPDATE book SET money=?, zname=? WHERE id=?";
		try {
			var row = qr.update(con, sql, 100001, "旅游支出", 3);
			System.out.println(row);
			DbUtils.closeQuietly(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function2() {
		QueryRunner qr = new QueryRunner();
		var sql = "DELETE FROM book WHERE id=?";
		try {
			var row = qr.update(con, sql, 4);
			System.out.println(row);
			DbUtils.closeQuietly(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function3() {
		var qr = new QueryRunner();
		try {
			Object[] result = qr.query(con, "SELECT * FROM book", new ArrayHandler());
			DbUtils.closeQuietly(con);
			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function4() {
		var qr = new QueryRunner();
		try {
			var result = qr.query(con, "SELECT * FROM book", new ArrayListHandler());
			DbUtils.closeQuietly(con);
			for (Object[] objects : result) {
				System.out.println(Arrays.toString(objects));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function5() {
		var qr = new QueryRunner();
		try {
			var result = qr.query(con, "SELECT * FROM users", new BeanHandler<User>(User.class));
			DbUtils.closeQuietly(con);
			System.out.println(result.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function6() {
		var qr = new QueryRunner();
		try {
			var result = qr.query(con, "SELECT * FROM users", new BeanListHandler<User>(User.class));
			DbUtils.closeQuietly(con);
			for (User user : result) {
				System.out.println(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function7() {
		var qr = new QueryRunner();
		try {
			var result = qr.query(con, "SELECT * FROM users", new ColumnListHandler<String>("uname"));
			DbUtils.closeQuietly(con);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function8() {
		var qr = new QueryRunner();
		try {
			var result = qr.query(con, "SELECT COUNT(*) FROM users", new ScalarHandler<Object>());
			DbUtils.closeQuietly(con);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function9() {
		var qr = new QueryRunner();
		try {
			var result = qr.query(con, "SELECT * FROM users", new MapHandler());
			DbUtils.closeQuietly(con);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void function10() {
		var qr = new QueryRunner();
		try {
			var result = qr.query(con, "SELECT * FROM users", new MapListHandler());
			DbUtils.closeQuietly(con);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

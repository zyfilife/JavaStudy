package com.zhuyifeng.demo001;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class Test {
	
	private static QueryRunner qr = new QueryRunner(JDBCUtils.getDatasource());

	public static void main(String[] args) {
		insert();
	}
	
	public static void insert() {
		try {
			var row = qr.update("INSERT INTO book (zname, money) VALUES(?, ?)", "吃饭支出", 1000.05);
			System.out.println(row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("数据库插入失败");
		}
	}

}

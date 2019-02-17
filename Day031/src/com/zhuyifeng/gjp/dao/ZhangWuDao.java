package com.zhuyifeng.gjp.dao;
/*
 * 实现对数据表gjp_zhangwu 数据增删改查
 * Dbuils工具类完成，类成员创建QueryRunner对象，指定数据源
 */

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zhuyifeng.gjp.domain.ZhangWu;
import com.zhuyifeng.gjp.tools.JDBCUtils;

public class ZhangWuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDatasource());
	
	public List<ZhangWu> selectAll() {
		try {
			return qr.query("SELECT * FROM gjp_zhangwu", new BeanListHandler<ZhangWu>(ZhangWu.class));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("查询所有账务失败");
		}
	}
	
	public List<ZhangWu> select(String startDate, String endDate) {
		try {
			return qr.query("SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?", new BeanListHandler<ZhangWu>(ZhangWu.class), startDate, endDate);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("条件查询账务失败");
		}
	}
	
	public boolean addZhangWu(ZhangWu zhangWu) {
		try {
			var row = qr.update("INSERT INTO gjp_zhangwu (flname, money, zhanghu, createtime, description) VALUES(?, ?, ?, ?, ?)", zhangWu.getFlname(), zhangWu.getMoney(), zhangWu.getZhanghu(), zhangWu.getCreatetime(), zhangWu.getDescription());
			return row > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("添加账务失败");
		}
	}
	
	public boolean editZhangWu(ZhangWu zhangWu) {
		try {
			var row = qr.update("UPDATE gjp_zhangwu SET flname = ?, money = ?, zhanghu = ?, createtime = ?, description = ? WHERE zwid = ?", zhangWu.getFlname(), zhangWu.getMoney(), zhangWu.getZhanghu(), zhangWu.getCreatetime(), zhangWu.getDescription(), zhangWu.getZwid());
			return row > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("编辑账务失败");
		}
	}
	
	public boolean deleteZhangWu(int zwid) {
		try {
			var row = qr.update("Delete From gjp_zhangwu WHERE zwid = ?", zwid);
			return row > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("删除账务失败");
		}
	}
}

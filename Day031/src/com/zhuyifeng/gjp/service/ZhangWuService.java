package com.zhuyifeng.gjp.service;
/*
 * 业务层类
 * 接受上一层，控制层controller的数据
 * 经过计算，传递给dao层，操作数据库
 * 调用dao层的类，类成员位置，创建dao类的对象
 */

import java.util.List;
import com.zhuyifeng.gjp.dao.ZhangWuDao;
import com.zhuyifeng.gjp.domain.ZhangWu;

public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();
	
	public List<ZhangWu> selectAll() {
		return dao.selectAll();
	}
	
	public List<ZhangWu> select(String startDate, String endDate) {
		return dao.select(startDate, endDate);
	}
	
	public boolean addZhangWu(ZhangWu zhangWu) {
		return dao.addZhangWu(zhangWu);
	}
	
	public boolean editZhangWu(ZhangWu zhangWu) {
		return dao.editZhangWu(zhangWu);
	}
	
	public boolean deleteZhangWu(int zwid) {
		return dao.deleteZhangWu(zwid);
	}
}

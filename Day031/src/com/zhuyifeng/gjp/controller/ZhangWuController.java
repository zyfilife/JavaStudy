package com.zhuyifeng.gjp.controller;

import java.util.List;
import com.zhuyifeng.gjp.domain.ZhangWu;
import com.zhuyifeng.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();
	
	public List<ZhangWu> selectAll() {
		return service.selectAll();
	}
	
	public List<ZhangWu> select(String startDate, String endDate) {
		return service.select(startDate, endDate);
	}
	
	public boolean addZhangWu(ZhangWu zhangWu) {
		return service.addZhangWu(zhangWu);
	}
	
	public boolean editZhangWu(ZhangWu zhangWu) {
		return service.editZhangWu(zhangWu);
	}
	
	public boolean deleteZhangWu(int zwid) {
		return service.deleteZhangWu(zwid);
	}
}

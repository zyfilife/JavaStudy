package com.zhuyifeng.gjp.view;
/*
 * 视图层，用户看到和操作的界面
 * 数据传递给controller层实现
 */

import java.util.List;
import java.util.Scanner;

import com.zhuyifeng.gjp.controller.ZhangWuController;
import com.zhuyifeng.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();

	private Scanner sc = new Scanner(System.in);
	
	public void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("------------------管家婆记账软件------------------");
			System.out.println("1.添加账务 2.编辑账务 3.删除账务 4.查询账务 5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			var choose = sc.nextInt();
			switch (choose) {
			case 1:
				addZhangWu();
				break;
			case 2:
				editZhangWu();
				break;
			case 3:
				deleteZhangWu();
				break;
			case 4:
				selectZhangWu();
				break;
			case 5:
				System.out.println("bye");
				sc.close();
				System.exit(0); 
				break;
			default:
				System.out.println("输入错误！");
				break;
			}
		}
	}

	private void addZhangWu() {
		System.out.println("输入分类名称");
		var flname = sc.next();
		System.out.println("输入金额");
		var money = sc.nextDouble();
		System.out.println("输入账户");
		var zhanghu = sc.next();
		System.out.println("输入日期：格式XXXX-XX-xx");
		var createtime = sc.next();
		System.out.println("输入具体描述");
		var description = sc.next();
		var zw = new ZhangWu(0, flname, money, zhanghu, createtime, description);
		if (controller.addZhangWu(zw)) {
			System.out.println("账务添加成功");
		}else {
			System.out.println("账务添加失败");
		}
	}
	
	private void editZhangWu() {
		selectAll();
		System.out.println("输入账务ID");
		var zwid = sc.nextInt();
		System.out.println("输入分类名称");
		var flname = sc.next();
		System.out.println("输入金额");
		var money = sc.nextDouble();
		System.out.println("输入账户");
		var zhanghu = sc.next();
		System.out.println("输入日期：格式XXXX-XX-xx");
		var createtime = sc.next();
		System.out.println("输入具体描述");
		var description = sc.next();
		var zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
		if (controller.editZhangWu(zw)) {
			System.out.println("账务编辑成功");
		}else {
			System.out.println("账务编辑失败");
		}
	}
	
	private void deleteZhangWu() {
		selectAll();
		System.out.println("输入账务ID");
		var zwid = sc.nextInt();
		if (controller.deleteZhangWu(zwid)) {
			System.out.println("账务删除成功");
		}else {
			System.out.println("账务删除失败");
		}
	}

	private void selectZhangWu() {
		System.out.println("1.所有查询  2.条件查询");
		var choose = sc.nextInt();
		switch (choose) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		default:
			break;
		}
	}
	
	private void selectAll() {
		var list = controller.selectAll();
		print(list);
	}
	
	private void select() {
		System.out.println("输入格式为XXXX-XX-XX,例如2019-02-16");
		System.out.print("请输入查询起始时间：");
		var startDate = sc.next();
		System.out.print("请输入查询结束时间：");
		var endDate = sc.next();
		var list = controller.select(startDate, endDate);
		print(list);
	}
	
	private void print(List<ZhangWu> list) {
		System.out.println("ID\t类别\t账户\t金额\t时间\t\t说明");
		for (ZhangWu zhangWu : list) {
			System.out.println(zhangWu.getZwid()+"\t"+zhangWu.getFlname()+"\t"+zhangWu.getZhanghu()+"\t"+zhangWu.getMoney()+"\t"+zhangWu.getCreatetime()+"\t"+zhangWu.getDescription());
		}
	}
}

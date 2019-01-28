package com.zhuyifeng.demo006;
/*
 * 多态
 * 可以调用共有方法
 * 不能调用子类特有方法 
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		Person s = new Student();
//		Person s = new Teacher();
		if (s instanceof Student) {
			Student p = (Student) s;
			p.sleep();
		}
		if (s instanceof Teacher) {
			Teacher p = (Teacher) s;
			p.teach();
		}
		if (s instanceof HighSchoolStudent) {
			//为防止强制转换失败，先进行判断
			HighSchoolStudent highS = (HighSchoolStudent) s;
			highS.highStudy();
		}
	}
	
}

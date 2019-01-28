package com.zhuyifeng.demo005;
/**
 * 多态中，成员特点
 * 
 * 成员变量
 * 编译看父类
 * 运行看父类
 * 
 * 成员方法
 * 编译看父类
 * 运行看子类
 * 
 * */
public class Test {

	public static void main(String[] args) {
		SupClass s = new SubClass();
		s.run();
		Animal a = new Cat();
		a.eat();
		System.out.println(s.a);
		Smoking p = new Person();
		p.smoking();
	}

}

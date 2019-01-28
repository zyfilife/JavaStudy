package com.zhuyifeng.demo005;

public class SubClass extends SupClass {
	int a = 1;
	@Override
	void run() {
		super.run();
		System.out.println("子类调用");
	}
}

package com.zhuyifeng.demo;

public class CustomRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread());
		}
	}
}

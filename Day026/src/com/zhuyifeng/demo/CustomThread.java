package com.zhuyifeng.demo;

public class CustomThread extends Thread {
	
	public CustomThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( Thread.currentThread());
		}
	}
}

package com.zhuyifeng.demo;

public class Input implements Runnable {
	
	private Resource r;
	
	private int i = 0;
	
	Input(Resource r) {
		super();
		this.r = r;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (r) {
				if (r.isFinished()) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (i%2==0) {
					r.setAge(13);
					r.setName("张三");
				}else {
					r.setAge(14);
					r.setName("李四");
				}
				r.setFinished(true);
				r.notify();
				i++;
			}
		}
	}
	
}

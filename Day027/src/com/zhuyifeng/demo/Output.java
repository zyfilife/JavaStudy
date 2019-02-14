package com.zhuyifeng.demo;

public class Output implements Runnable {

	private Resource r;
	
	Output(Resource r) {
		super();
		this.r = r;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (r) {
				if (!r.isFinished()) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(r);
				r.setFinished(false);
				r.notify();
			}
		}
	}
	
}

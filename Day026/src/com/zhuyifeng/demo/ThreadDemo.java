package com.zhuyifeng.demo;

public class ThreadDemo {
	public static void main(String[] args) {
//		var ct = new CustomThread("com.zhuyifeng.customThread");
//		ct.start();
//		for (int i = 0; i < 50; i++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println( Thread.currentThread());
//		}
//		System.out.println(ct.getName());
//		
//		
//		var cr = new CustomRunnable();
//		var t = new Thread(cr);
//		t.start();
		
//		new Thread() {
//			public void run() {
//				System.out.println( Thread.currentThread());
//			};
//		}.start();;
		//匿名内部类
		var t0 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println( Thread.currentThread());
			}
		});
		t0.start();	
		System.out.println(t0.getState());
	}
}

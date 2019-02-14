package com.zhuyifeng.demo2.copy;

public class Tickets implements Runnable {
	private int i = 0;
	@Override
	public void run() {
		while (i < 100) {
			if (i%2==0) {
				synchronized (LockA.a) {
					synchronized (LockB.b) {
						System.out.println(i+"   a....b");
					}
				}
			}else {
				synchronized (LockB.b) {
					synchronized (LockA.a) {
						System.out.println(i+"   b....a");
					}
				}
			}
			i++;
		}
	}
}

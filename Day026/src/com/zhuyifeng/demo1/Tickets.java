package com.zhuyifeng.demo1;

public class Tickets implements Runnable {
	private int ticketNumber = 100;

	@Override
	public void run() {
		while (true) {
			if (!pay0()) {
				break;
			}
		}
	}
	
	public boolean pay() {
		synchronized (this) {
			if (ticketNumber > 0) {
				ticketNumber -= 1;
				System.out.println(Thread.currentThread().getName()+"出售第"+(100-ticketNumber)+"张票");
				return true;
			}else {
				return false;
			}
		}
	}
	
	public synchronized boolean pay0() {
		if (ticketNumber > 0) {
			ticketNumber -= 1;
			System.out.println(Thread.currentThread().getName()+"出售第"+(100-ticketNumber)+"张票");
			return true;
		}else {
			return false;
		}
	}
}

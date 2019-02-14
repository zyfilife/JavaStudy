package com.zhuyifeng.demo;

public class Tickets implements Runnable {
	private int ticketNumber = 100;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (ticketNumber > 0) {
					ticketNumber -= 1;
					System.out.println("出售第"+(100-ticketNumber)+"张票");
				}else {
					break;
				}
			}
		}
	}
}

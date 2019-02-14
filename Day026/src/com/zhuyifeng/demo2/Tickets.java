package com.zhuyifeng.demo2;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
	private int ticketNumber = 100;
	private ReentrantLock l = new ReentrantLock();
	@Override
	public void run() {
		while (true) {
			if (!pay()) {
				break;
			}
		}
	}
	
	public boolean pay() {
		l.lock();
		if (ticketNumber > 0) {
			ticketNumber -= 1;
			System.out.println(Thread.currentThread().getName()+"出售第"+(100-ticketNumber)+"张票");
			l.unlock();
			return true;
		}else {
			l.unlock();
			return false;
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

package com.zhuyifeng.demo2.copy;

public class TicketsDemo {
	public static void main(String[] args) {
		function0();
	}
	
	static void function0() {
		var ticket = new Tickets();
		var t0 = new Thread(ticket);
		var t1 = new Thread(ticket);
		var t2 = new Thread(ticket);
		t0.start();
		t1.start();
		t2.start();
	}
}

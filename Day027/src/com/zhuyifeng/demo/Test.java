package com.zhuyifeng.demo;

public class Test {
	public static void main(String[] args) {
		var r = new Resource();
		var in = new Input(r);
		var out = new Output(r);
		var t0 = new Thread(in);
		var t1 = new Thread(out);
		t0.start();
		t1.start();
	}
}

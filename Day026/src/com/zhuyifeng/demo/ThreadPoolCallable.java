package com.zhuyifeng.demo;

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "abc";
	}

}

package com.zhuyifeng.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		function1();
	}
	
	static void function0() {
		ExecutorService es = Executors.newFixedThreadPool(5);
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		es.shutdown();
	}
	
	static void function1() {
		ExecutorService es = Executors.newFixedThreadPool(5);
		Future<Integer> f = es.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Integer sum = 0;
				for (int i = 1; i < 101; i++) {
					sum = sum + i;
				}
				return sum;
			}
		});
		try {
			System.out.println(f.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Future<Integer> f0 = es.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Integer sum = 0;
				for (int i = 1; i < 201; i++) {
					sum = sum + i;
				}
				return sum;
			}
		});
		try {
			System.out.println(f0.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.shutdown();
	}
}

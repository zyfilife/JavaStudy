package com.zhuyifeng.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CommonIoDemo {
	public static void main(String[] args) {
		try {
			String s = FileUtils.readFileToString(new File("/Users/zhuyifeng/Desktop/a.text"), "GBK");
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileUtils.writeStringToFile(new File("/Users/zhuyifeng/Desktop/f.txt"), "helloWorld", "GBK", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileUtils.copyFile(new File("/Users/zhuyifeng/Desktop/f.txt"), new File("/Users/zhuyifeng/Desktop/h.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileUtils.copyDirectory(new File("/Users/zhuyifeng/Desktop/HTML"), new File("/Users/zhuyifeng/Desktop/HTML01"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

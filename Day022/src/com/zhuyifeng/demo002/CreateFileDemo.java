package com.zhuyifeng.demo002;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateFileDemo {
	
	public static void main(String[] args) {
		function9();
	}
	
	static void function0() {
		File f = new File("/Users/zhuyifeng/Desktop/a.text");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void function1() {
		File f0 = new File("/Users/zhuyifeng/Desktop/java0");
		f0.mkdir();
		
		File f1 = new File("/Users/zhuyifeng/Desktop/java1/java2/java3");
		f1.mkdirs();
		
		File f2 = new File("/Users/zhuyifeng/Desktop/java4");
		f2.mkdirs();
	}
	
	static void function2() {
		File f3 = new File("/Users/zhuyifeng/Desktop/123");
		f3.delete();
		f3.deleteOnExit();
	}
	
	static void function3() {
		File f0 = new File("/Users/zhuyifeng/Desktop/HTML/001.html");
		System.out.println(f0.length());
	}
	
	static void function4() {
		//eclipse中，如果写的是一个相对路径，获取的绝对路径为项目的根目录
		File f0 = new File("/Users/zhuyifeng/Desktop/HTML/001.html");
		System.out.println(f0.getAbsoluteFile());
		System.out.println(f0.getParentFile());
	}
	
	static void function5() {
		File f0 = new File("/Users/zhuyifeng/Desktop/HTML/001.html");
		if (f0.exists()) {
			System.out.println(f0.isFile());
			System.out.println(f0.isDirectory());
		}
	}
	
	static void function6() {
		//获取系统根目录
		System.out.println(Arrays.toString(File.listRoots()));
	}
	
	static void function7() {
		//获取系统根目录
		File f = new File("/Users/zhuyifeng/Desktop/HTML/");
		File[] list = f.listFiles();
		System.out.println(Arrays.toString(list));
		
		File[] list0 = f.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.isFile()) {
					return true;
				}
				return false;
			}
		});
		System.out.println(Arrays.toString(list0));
	}
	
	static void function8() {
		File f = new File("/Users/zhuyifeng/Desktop/HTML/");
		getDir(f); 
	}

	//递归函数
	static void getDir(File f) {
		File[] list = f.listFiles();
		for (File file : list) {
			if (file.isDirectory()) {
				getDir(file);
			}else {
				System.out.println(file);
			}
		}
	}
	
	static void function9() {
		File dir = new File("/Users/zhuyifeng/JavaStudy");
		ArrayList<File> javaFiles = new ArrayList<File>();
		getJavaFiles(dir, javaFiles); 
		System.out.println(javaFiles);
	}

	//递归函数
	static void getJavaFiles(File dir, ArrayList<File> files) {
		File[] list = dir.listFiles();
		for (File file : list) {
			if (file.isDirectory()) {
				getJavaFiles(file, files);
			}else {
				if (file.getName().endsWith(".java")) {
					files.add(file);
				}
			}
		}
	}
}

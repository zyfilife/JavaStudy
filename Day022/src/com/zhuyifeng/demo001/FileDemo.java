package com.zhuyifeng.demo001;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;

public class FileDemo {
	public static void main(String[] args) {
//		System.out.println(File.pathSeparator);
//		System.out.println(File.separator);
		
//		File f = new File("/Users/zhuyifeng/Desktop/Java视频");
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getPath());
//		System.out.println(f.isAbsolute());
//		
//		File f0 = new File("/Users/zhuyifeng/Desktop", "Java视频");
//		System.out.println(f0);
//		String[] files = f0.list();
//		
//		for (String name : files) {
//			File file = new File(f0.getPath(), name);
//			System.out.println(file);
//		}
		File f1 = new File("/Users/zhuyifeng/Desktop/Java视频");
//		System.out.println(f1);
		FileFilter fl = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.getName().contains(".avi")) {
					return true;
				}
				return false;
			}
		};
		File[] files1 = f1.listFiles(fl);
		
		ArrayList<File> videoFiles = new ArrayList<File>();
		for (File file : files1) {
			videoFiles.add(file);
		}
		Collections.sort(videoFiles);
		System.out.println(videoFiles);
	}
	
	
}

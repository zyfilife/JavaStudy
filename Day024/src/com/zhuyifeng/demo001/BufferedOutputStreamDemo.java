package com.zhuyifeng.demo001;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		function1();
	}
	
	static void function0() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/Users/zhuyifeng/Desktop/b.text");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write("hellow".getBytes());
			bos.flush();
			bos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void function1() {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		int len = 0;
		var bytes = new byte[1024];
		try {
			fos = new FileOutputStream("/Users/zhuyifeng/Desktop/c.text");
			fis = new FileInputStream("/Users/zhuyifeng/Desktop/a.text");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			BufferedInputStream bis = new BufferedInputStream(fis);
			while ((len = bis.read(bytes)) != -1) {
				bos.write(bytes, 0, len);
				bos.flush();
			}
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.zhuyifeng.demo001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		function1();
	}
	
	static void function1() {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		int len = 0;
		var c = new char[1024];
		try {
			fi = new FileInputStream("/Users/zhuyifeng/Desktop/a.text");
			//默认GBK, UTF-8
			isr = new InputStreamReader(fi, "GBK");
			while ((len = isr.read(c)) != -1) {
				System.out.print(new String(c, 0, len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.zhuyifeng.demo001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class OutputStreamWriterDemo {
	public static void main(String[] args) {
		function0();
	}
	
	static void function0() {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream("/Users/zhuyifeng/Desktop/e.text");
			//默认GBK, UTF-8
			osw = new OutputStreamWriter(fos, "UTF-8");
			osw.write("你好");
			osw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null) {
					osw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}

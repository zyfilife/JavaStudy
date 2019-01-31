package com.zhuyifeng.demo001;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	
	public static void main(String[] args) {
		function1();
	}
	
	static void function0() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/zhuyifeng/Desktop/c.text");
			fw.write("hello world");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void function1() {
		FileWriter fw = null;
		FileReader fr = null;
		var c = new char[1024];
		int len = 0;
		try {
			fr = new FileReader("/Users/zhuyifeng/Desktop/a.text");
			fw = new FileWriter("/Users/zhuyifeng/Desktop/d.text");
			while ((len = fr.read(c)) != -1) {
				fw.write(c, 0, len);
				fw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if (fr != null) {
						fr.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

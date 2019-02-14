package com.zhuyifeng.demo001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		function1();
	}
	
	static void function0() {
		FileWriter fw = null;
		FileReader fr = null;
		int len = 0;
		var cbuf = new char[1024];
		try {
			fw = new FileWriter("/Users/zhuyifeng/Desktop/e.text");
			fr = new FileReader("/Users/zhuyifeng/Desktop/a.text");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			while ((len = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, len);
				bw.flush();
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void function1() {
		FileWriter fw = null;
		FileReader fr = null;
		String line = null;
		try {
			fw = new FileWriter("/Users/zhuyifeng/Desktop/d.text");
			fr = new FileReader("/Users/zhuyifeng/Desktop/a.text");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

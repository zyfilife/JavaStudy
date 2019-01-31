package com.zhuyifeng.demo001;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/zhuyifeng/Desktop/a.text");
			int len = 0;
			var b = new char[1];
			try {
				while ((len = fr.read(b)) != -1) {
					System.out.print(new String(b,0,len));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
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

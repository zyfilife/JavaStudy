package com.zhuyifeng.demo001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	
	public static void main(String[] args) {
		File f = new File("/Users/zhuyifeng/Desktop/a.text");
		FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream(f);
			fileOut.write("hello".getBytes()); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileOut != null) {
					fileOut.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

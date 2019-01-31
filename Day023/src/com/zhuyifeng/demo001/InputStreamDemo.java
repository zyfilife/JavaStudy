package com.zhuyifeng.demo001;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		function3();
	}
	
	static void function0() {
		File f = new File("/Users/zhuyifeng/Desktop/a.text");
		FileInputStream fileIn = null;
		int i = 0;
		try {
			fileIn = new FileInputStream(f);
			while (( i = fileIn.read()) != -1) {
				System.out.println((char)i);
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileIn != null) {
					fileIn.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void function1() {
		File f = new File("/Users/zhuyifeng/Desktop/a.text");
		FileInputStream fileIn = null;
		byte[] bytes = new byte[2];
		int i = 0;
		try {
			fileIn = new FileInputStream(f);
			while ((i = fileIn.read(bytes)) != -1) {
				System.out.println(new String(bytes, 0, i));
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileIn != null) {
					fileIn.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void function2() {
		File f = new File("/Users/zhuyifeng/Desktop/a.text");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File dest = new File("/Users/zhuyifeng/Desktop/b.text");
		System.out.println(f.renameTo(dest)); 
	}
	
	static void function3() {
		File f = new File("/Users/zhuyifeng/Desktop/a.text");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("/Users/zhuyifeng/Desktop/a.text");
			fout = new FileOutputStream("/Users/zhuyifeng/Desktop/b.text");
			int len = 0;
			byte[] b = new byte[2];
			while ((len = fin.read(b)) != -1) {
				fout.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fout != null) {
					fout.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if (fin != null) {
						fin.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}

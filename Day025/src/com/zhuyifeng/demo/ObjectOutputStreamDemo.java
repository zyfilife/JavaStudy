package com.zhuyifeng.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	
	public static void main(String[] args) {
		readObject();
//		writeObject();
	}
	
	static void writeObject() {
		var p = new Person("a", 1, "b");
		Person.setSex(1);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/Users/zhuyifeng/Desktop/e");
			var oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void readObject() {
		FileInputStream fis = null;
		Person p0 = null;
		try {
			fis = new FileInputStream("/Users/zhuyifeng/Desktop/e");
			var ois = new ObjectInputStream(fis);
			p0 = (Person)ois.readObject();
			System.out.println(p0);
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

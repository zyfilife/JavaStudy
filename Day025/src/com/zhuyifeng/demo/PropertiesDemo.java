package com.zhuyifeng.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		function0();
	}

	static void function0() {
		var p = new Properties();
		p.setProperty("key0", "value0");
		p.setProperty("key1", "value1");
		p.setProperty("key2", "value2");
		p.setProperty("key3", "value3");
		p.setProperty("key4", "value4");
		p.setProperty("key5", "value5");
		System.out.println(p.getProperty("key0"));
		System.out.println(p.getProperty("key", "default"));
		System.out.println(p.stringPropertyNames());

		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/zhuyifeng/Desktop/a.properties");
			p.store(fw, "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		var p0 = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/zhuyifeng/Desktop/a.properties");
			p0.load(fr);
			System.out.println(p0);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}

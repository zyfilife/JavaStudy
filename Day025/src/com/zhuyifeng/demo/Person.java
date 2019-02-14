package com.zhuyifeng.demo;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	/*
	 * transient 瞬态关键字
	 * 阻止成员变量序列化
	 */
	private transient int age;
	
	private static int sex;
	
	private String schoolName;
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getSex() {
		return sex;
	}

	public static void setSex(int sex) {
		Person.sex = sex;
	}

	Person(String name, int age, String schoolName) {
		super();
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nname:" + name + "\nage:" +  age + "\nsex:" + sex + "\nschoolName:" +  schoolName;
	}
}

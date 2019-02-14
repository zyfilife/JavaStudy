package com.zhuyifeng.demo;

public class Resource {
	private String name;
	private int age;
	private boolean isFinished;
	
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

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	
	Resource() {
		this.isFinished = false;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nname: "+name+"\nage:"+age;
	}
}

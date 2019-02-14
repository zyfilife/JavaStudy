package com.zhuyifeng.demo001;

public class User {
	private int id;
	private String uname;
	private String address;
	private String u_password;
	
	public User(int id, String uname, String address, String u_password) {
		super();
		this.id = id;
		this.uname = uname;
		this.address = address;
		this.u_password = u_password;
	}
	
	public String getU_password() {
		return u_password;
	}
	
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

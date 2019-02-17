package com.zhuyifeng.demo001;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) {
		function0();
	}
	
	public static void function0() {
		try {
			var host = InetAddress.getLocalHost();
			System.out.println(host.getHostName());
			System.out.println(host.getHostAddress());
			System.out.println(host.getAddress());
			
			System.out.println(InetAddress.getByName("www.xinliang.com"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}
 
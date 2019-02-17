package com.zhuyifeng.demo005;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		var b = new byte[1024];
		try {
			socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 8888); 
			var read = new FileInputStream("/Users/zhuyifeng/Movies/224.rmvb");
			var len = 0;
			while ((len = read.read(b)) != -1) {
				socket.getOutputStream().write(b, 0, len);
			}
			socket.shutdownOutput();
			var i = socket.getInputStream();
			var length = i.read(b);
			System.out.println(new String(b, 0, length));
			read.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.zhuyifeng.demo004;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		var b = new byte[1024];
		try {
			socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 8888);
			socket.getOutputStream().write("发送".getBytes());
			var i = socket.getInputStream();
			var len = i.read(b);
			System.out.println(new String(b, 0, len));
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

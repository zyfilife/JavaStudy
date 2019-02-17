package com.zhuyifeng.demo004;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket server = null;
		var b = new byte[1024];
		try {
			server = new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			var socket = server.accept();
			System.out.println(socket);
			var i = socket.getInputStream();
			var len = i.read(b);
			System.out.println(new String(b, 0, len));
			socket.getOutputStream().write("接受".getBytes());
			socket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

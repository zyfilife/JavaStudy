package com.zhuyifeng.demo005;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	static private ServerSocket server = null;
	
	public static void main(String[] args) {
		try {
			server = new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			Socket socket = null;
			try {
				socket = server.accept();
			} catch (IOException e) {
				e.printStackTrace();
			}
			var u = new Upload(socket);
			var t = new Thread(u);
			t.start();
		}
	}
}

package com.zhuyifeng.demo003;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {
	
	static private DatagramSocket socket = null;
	
	public static void main(String[] args) {
		var buf = new byte[1024];
		try {
			socket = new DatagramSocket(9000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		while (true) {
			var p = new DatagramPacket(buf, buf.length);
			try {
				socket.receive(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
			var lenght = p.getLength();
			System.out.println(new String(buf, 0, lenght));
			System.out.println(p.getAddress().getHostAddress());
			System.out.println(p.getPort());
		}
	}
}

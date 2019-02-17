package com.zhuyifeng.demo002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {
	public static void main(String[] args) {
		var buf = new byte[1024];
		var p = new DatagramPacket(buf, buf.length);
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(9000);
			socket.receive(p);
			var lenght = p.getLength();
			System.out.println(new String(buf, 0, lenght));
			System.out.println(p.getAddress().getHostAddress());
			System.out.println(p.getPort());
			socket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.zhuyifeng.demo002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSend {
	
	public static void main(String[] args) {
		send("发送UDP");
	}
	
	public static void send(String message) {
		var bytes = message.getBytes();
		try {
			var dp = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 9000);
			var socket = new DatagramSocket();
			socket.send(dp);
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.zhuyifeng.demo003;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPSend {
	
	static private Scanner sc = new Scanner(System.in);
	static private DatagramSocket socket = null;
	
	
	public static void main(String[] args) {
		try {
			socket = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		while (true) {
			System.out.println("请输入要发送的数据:");
			var message = sc.nextLine();
			send(message);
		}
	}
	
	public static void send(String message) {
		var bytes = message.getBytes();
		try {
			var dp = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 9000);
			socket.send(dp);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

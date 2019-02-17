package com.zhuyifeng.demo005;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable{

	private Socket socket;
	
	public Upload(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		var b = new byte[1024];
		try {
			var i = socket.getInputStream();
			var fileName = "demo"+System.currentTimeMillis()+new Random().nextInt(99999)+".rmvb";
			var out = new FileOutputStream("/Users/zhuyifeng/Pictures/"+fileName);
			var len = 0;
			while ((len = i.read(b)) != -1) {
				out.write(b, 0, len);
			}
			socket.getOutputStream().write("上传完毕".getBytes());
			out.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

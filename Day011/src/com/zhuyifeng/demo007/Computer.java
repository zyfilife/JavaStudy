package com.zhuyifeng.demo007;

public class Computer {
	void open() {
		
	}
	
	void close() {
		
	}
	
	void useUsb(Usb usb) {
		usb.open();
	}
	
	void unuseUsb(Usb usb) {
		usb.close();
	}
}

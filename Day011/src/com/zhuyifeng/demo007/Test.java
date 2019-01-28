package com.zhuyifeng.demo007;
/*
 * 接口的应用
 * 举例：键盘和鼠标都是接口usb的实现类
 * 		因此电脑的useUSB的方法中的参数，只需要是USB类型就可以，而不需要针对不同实现类型的参数，写不同的方法
 */
public class Test {

	public static void main(String[] args) {
		Computer c = new Computer();
		c.open();
		Mouse m = new Mouse();
		c.useUsb(m);
	}

}

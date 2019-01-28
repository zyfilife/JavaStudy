package com.zhuyifeng.demo001;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 多catch异常有没有顺序
 * 如果异常之间不是父子类关系，则没有顺序
 * 如果异常之间是继承关系，则父类异常写在后面，子类异常写在前面
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		try {
			int[] array = {};
//			int[] array = null;
			getValue(array);
		} catch (NullPointerException e) {
			System.out.println("数组为null");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		} catch (RuntimeException e) {
			System.out.println("数组元素个数小于5");
		}finally {
			System.out.println("不管对错都执行");
		}
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			f.parse("2018-01-01");
		}catch (ParseException e) {
			
		}
	}
	
	static int getValue(int[] array) throws RuntimeException, NullPointerException, ArrayIndexOutOfBoundsException {
		if (array == null) {
			throw new NullPointerException();
		}else if (array.length < 5) {
			throw new RuntimeException();
		}
		int index = 3;
		if (index >= array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int i = array[index];
		return i;
	}

}

package day004;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个数组
		//1、数据类型[] 变量名 = new 数据类型[数组的长度]
		int[] array = new int[5];
		System.out.println(array.length);
		System.out.println(array[4]);
		//2、数据类型[] 变量名 = new 数据类型[]{元素, 元素}
		int[] arraya = new int[] {1,2,3,4,5};
		System.out.println(arraya.length);
		System.out.println(arraya[0]);
		//3、数据类型[] 变量名 = {元素, 元素}
		int[] arrayb = {6,7,8,9,10};
		System.out.println(arrayb.length);
		System.out.println(arrayb[0]);
		//数组遍历
		for (int i = 0; i < arrayb.length; i ++) {
			System.out.println("数组内元素："+arrayb[i]);
		}
		//数组异常
		//1、数组越界
//		System.out.println(arrayb[5]);
		//2、空数组
//		arrayb = null;
//		System.out.println(arrayb[0]);
		//获取最大值
		int a = arrayb[0];
		for (int i = 1; i < arrayb.length; i ++) {
			if (a < arrayb[i]) {
				a = arrayb[i];
			}
		}
		for (int i : arrayb) {
			System.out.println(i);
		}
		System.out.println("数组内最大元素："+a);
		//二维数组
		int[][] arrayC = new int[3][4];
		System.out.println(arrayC);
		System.out.println(arrayC[0][0]);
		int[][] arrayD = new int [][] {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
		for (int i = 0; i < arrayD.length; i++) {
			int[] arrayE = arrayD[i];
			for (int j = 0; j < arrayE.length; j++) {
				int h = arrayE[j];
				System.out.println("数组内元素："+h);
			}
		}
		
	}

}

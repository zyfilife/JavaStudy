package day004;

import java.util.Random;

public class CallName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
		Random rn = new Random();
		int i = rn.nextInt(names.length);
		System.out.println(names[i]);
	}
}

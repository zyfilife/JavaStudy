import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		for (int i = 0; i < 10; i++) {
			//随机数不包含50
			int a = rn.nextInt(50);
			System.out.println(a);
			float f = rn.nextFloat();
			System.out.println(f);
			double d = rn.nextDouble();
			System.out.println(d);
		}
	}
}

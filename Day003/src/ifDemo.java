
public class ifDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float score = 100;
		if (score > 100) {
			System.out.println("分数大于100");
		}else if (score == 100) {
			System.out.println("分数等于100");
		}else {
			System.out.println("分数小于100");
		}
		while (score >= 80) {
			System.out.println(score);
			score --;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		int ia = 0;
		do {
			ia++;
			System.out.println(ia);
		}while (ia < 10);
		
	}

}

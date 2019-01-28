
public class StringDemo {
	public static void main(String[] args) {
		String site = "www.baidu.com";
		System.out.println(site.length());
		String string1 = "string1";
		String string2 = "string2";
		System.out.println(string1.concat(string2));
		System.out.println(string1+string2);
		int i = 1;
		float f = 10.5f;
		String s = "1000";
		System.out.printf("整数： %d, 浮点数： %f, 字符串： %s \n", i, f, s);
		String fs = String.format("整数： %d, 浮点数： %f, 字符串： %s", i, f, s);
		System.out.println(fs);
		
		String a = "after";
		String b = "before";
		System.out.println(a.compareTo(b));
		
		String site0 = "";
		site0 = String.copyValueOf(site.toCharArray(), 3, 2);
		System.out.println(site0);
		
		StringBuffer sb = new StringBuffer();
		sb.append("123");
		System.out.println(sb);
	}
}

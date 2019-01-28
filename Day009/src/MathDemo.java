
public class MathDemo {
	
	public static void main(String[] args) {
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);  
        Double n = 100.5;
        System.out.println(n.compareTo(30.6));
        System.out.println(n.compareTo(130.6));
        System.out.println(n.compareTo(100.5));
        System.out.println(n.equals(100.5));
        String s = "100";
        System.out.println(Integer.parseInt(s));
        System.out.println(Integer.parseInt(s, 2));
        System.out.println(Integer.parseInt(s, 8));
        System.out.println(Integer.parseInt(s, 16));
	}

}

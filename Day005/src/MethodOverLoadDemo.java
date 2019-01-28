
public class MethodOverLoadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

	// 方法格式
	// 修饰符 返回值类型 方法名(参数类型 变量名) {
	// }
	public static void method() {
		System.out.println("无参数");
	}

	// 方法的重载
	// 方法重载和变量名无关
	// 方法重载和返回值类型无关
	// 方法重载和修饰符无关
	// 方法重载只看方法名和参数列表
	public static void method(int a, int b) {

	}

	public static void method(int a, double b) {

	}

	public static void method(double a, int b) {

	}
}

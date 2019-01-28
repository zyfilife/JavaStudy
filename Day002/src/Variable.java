
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建变量三要素， 类型 命名 = 值
		//整数默认int类型，如果是long类型， 数值后面加L后缀, 如1234578901L
		//byte 1字节 -128～127
		byte b = 100;
		System.out.println(b);
		//short 2字节 -32768～23767
		short s = 500;
		System.out.println(s);
		//int 4字节 -2147483648～2147483647
		int i = 100000;
		System.out.println(i);
		//long 8字节 -2的64次幂～2的64幂-1
		long l = 21474836400L;
		System.out.println(l);
		//浮点数默认double类型，如果是float类型， 数值后面加F后缀, 如123.2F
		//float 4字节
		float f = 100.0F;
		System.out.println(f);
		//double 8字节
		double d = 100000.00;
		System.out.println(d);
		//变量定义，不赋值不能使用
		//变量有自己的作用范围
		//变量不可以重复定义
		int ia;
		ia = 5;
		System.out.println(ia);
		//数据类型转换
		//取值范围小的可以自动转为取值范围大的
		int ib = 100;
		double db = ib;
		System.out.println(db);
		//强制转换
		double dc = 3.14;
		int ic = (int)dc;
		System.out.println(ic);

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class ShopManager {

	static ArrayList<Product> array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initData();
		while (true) {
			openMainMenu();
			switch (getUserChose()) {
			case 1:
				showProductList();
				break;
			case 2:
				addFruit();
				break;
			case 3:
				deleteProduct();
				break;
			case 4:
				updateFruit();
				break;
			case 5:
				return;
			default:
				break;
			}
		}
	}

	private static void initData() {
		array = new ArrayList<Product>();
		Product f1 = new Product();
		f1.ID = 9527;
		f1.name = "少林寺酥饼核桃";
		f1.price = 12.7;

		Product f2 = new Product();
		f2.ID = 9008;
		f2.name = "尚康杂粮牡丹饼";
		f2.price = 5.6;

		Product f3 = new Product();
		f3.ID = 9879;
		f3.name = "新疆原产哈密瓜";
		f3.price = 599.6;

		array.add(f1);
		array.add(f2);
		array.add(f3);
	}

	private static void openMainMenu() {
		System.out.println("============欢迎光临ItCast超市============");
		System.out.println("1: 货物 清单   2: 添加货物   3: 删除货物   4: 修改货物  5: 退出");
		System.out.println("请您输入要操作的功能序号");
	}

	@SuppressWarnings("resource")
	private static int getUserChose() {
		return new Scanner(System.in).nextInt();
	}
	
	private static void showProductList() {
		System.out.println();
		System.out.println("================商品库存清单================");
		System.out.println("商品编号         商品名称                商品单价");
		for(int i = 0 ; i < array.size(); i++){
			Product item = array.get(i);
			System.out.println(item.ID+"   "+item.name+"        "+item.price);
		}
	}
	
	private static void addFruit(){
		System.out.println("选择的是添加商品功能");
		//创建Scanner变量
		var sc = new Scanner(System.in);
		System.out.println("请输入商品的编号");
		//输入商品的编号
		int ID = sc.nextInt();
		//输入商品的名字
		System.out.println("请输入商品的名字");
		String name = sc.next();
		//输入商品的单价
		System.out.println("输入商品的单价");
		double price = sc.nextDouble();
		//创建FruitItem变量
		Product item = new Product();
		//item.属性赋值
		item.ID = ID;
		item.name = name;
		item.price = price;
		array.add(item);
		System.out.println("商品添加成功");
		sc.close();
	}
	
	private static void updateFruit(){
		System.out.println("选择的是修改功能");
		System.out.println("请输入商品的编号");
		
		var sc = new Scanner(System.in);
		int ID = sc.nextInt();
		//遍历集合,获取每个FruitItem变量
		for(int i = 0 ; i < array.size(); i++){
			Product item = array.get(i);
			//获取FruitItem的属性ID,和用户输入的ID比较
			if(item.ID == ID){
				System.out.println("输入新的商品编号");
				item.ID = sc.nextInt();
				
				System.out.println("输入新的商品名字");
				item.name = sc.next();
				
				System.out.println("输入新的商品价格");
				item.price = sc.nextDouble();
				System.out.println("商品修改成功");
				sc.close();
				return ;
			}
		}
		sc.close();
		System.out.println("输入的编号不存在");
	}
	
	private static void deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("选择的是删除功能");
		System.out.println("请输入商品的编号");
		int ID = getUserChose();
		Product model = null;
		for (int i = 0; i < array.size(); i++) {
			Product item = array.get(i);
			if (item.ID == ID) {
				model = item;
				array.remove(i);
				System.out.println("删除成功");
				break;
			}
		}
		if (model == null) {
			System.out.println("你输入的编号不存在");
		}
	}

}

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat formatter = new SimpleDateFormat("GG yyyy-MM-dd E D F");
		System.out.println(formatter.format(date));
	 
	     //c的使用  
	    System.out.printf("全部日期和时间信息：%tc%n",date);          
	    //f的使用  
	    System.out.printf("年-月-日格式：%tF%n",date);  
	    //d的使用  
	    System.out.printf("月/日/年格式：%tD%n",date);  
	    //r的使用  
	    System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
	    //t的使用  
	    System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
	    //R的使用  
	    System.out.printf("HH:MM格式（24时制）：%tR%n",date); 
        
	    // 使用toString()显示日期和时间
	    System.out.printf("%1$s %2$tB %2$td, %2$tY%n", "Due date:", date);
	    // 显示格式化时间
	    System.out.printf("%s %tB %<te, %<tY%n", "Due date:", date);
	}
}

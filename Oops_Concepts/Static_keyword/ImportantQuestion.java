package Oops_Concepts.Static_keyword;

/*
 * wap to count no of Objects creatyed in java?
 */

class Demo{
	int a,b;
	static int count;
	
	public Demo() {
		count++;
	}
}
public class ImportantQuestion {
	public static void main(String[] args) {
		Demo d1= new Demo();
		Demo d2= new Demo();
		Demo d3= new Demo();
		Demo d4= new Demo();
		Demo d5= new Demo();
		
		System.out.println(" No of objects created are:"+ Demo.count);
	}

}

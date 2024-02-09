package Oops_Concepts.Static_keyword;

/*
 * method calling
 */

class Dog3{
	static String name;
	static int cost;
	
	public static void  buy() {
		System.out.println("inside static method");
		//display(); cannot call a non static method
	}
	
	public void display() {
		buy();//can call method inside a method but can't create a new method.
	}
}
public class Example3 {
	public static void main(String[] args) {
		 Dog3.buy();
		 Dog3 d1= new Dog3();
		 d1.display();
	}

}

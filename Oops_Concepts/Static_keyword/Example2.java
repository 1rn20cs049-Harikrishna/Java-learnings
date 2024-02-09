package Oops_Concepts.Static_keyword;
/*
 * order of execution.
 */

class Dog1{
	
	//static variables
	static String name;
	static int cost;
	
	//static block
	static {
		name="sheru";
		cost=20000;
		System.out.println("static block ");
	}
	
	//static method
	static void display() {
		System.out.println("inside a static display method");
	}
	
	//java block
	{
		System.out.println("inside java block");
	}
	
	//constructor
	public Dog1() {
		System.out.println("inside Constructor");
	}
	
	//non static method
	void print() {
		System.out.println("non static method");
	}
}
public class Example2 {
	public static void main(String[] args) {
		 Dog1 d1 = new Dog1();
		 Dog1 d2 = new Dog1();
		 
		 Dog1.display();
		 d1.print();
		 
		 System.out.println(d1.name);
		 System.out.println(d2.name);
		 
		 d2.name="tommy";
		 
		 System.out.println(d1.name);
		 
	}

}

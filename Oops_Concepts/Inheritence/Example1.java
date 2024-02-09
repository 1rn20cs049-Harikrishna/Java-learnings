package Oops_Concepts.Inheritence;


class Parent{  // by default extends Object
	int a=10;
	int b=20;
	private int c=20;
	
	
	private void disp() {
		System.out.println("private methods");
	}
	public void display() {
		System.out.println("parent class");
	}
	
}

class Child extends Parent{
	
	// private instance of class do not participate in Inheritance,
	//to preserve the concept of encapsulation.
	
}
public class Example1 {
	public static void main(String[] args) {
		Child c1= new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
	//	System.out.println(c1.c); cte
		
		c1.display();
		//c1.disp(); cte


		
	}

}

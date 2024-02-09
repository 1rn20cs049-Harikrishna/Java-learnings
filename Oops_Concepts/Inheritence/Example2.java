package Oops_Concepts.Inheritence;
/* 
 * Multilevel inheritance is allowed.
 * Multiple inheritance is not allowed it will lead to diamond shame problem.
 * inheritance is a IS-A Relationship.
 * a Parent can have n child classes
 * 
 */

class Parent1{  // by default extends Object
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
class Child1 extends Parent1{
	
}
class Child2 extends Parent1{
	
}
class Child3 extends Parent1{
	
}
public class Example2 {
	public static void main(String[] args) {
		
		Child3 c3 = new Child3();
		System.out.println(c3.a);
		c3.display();
	} 
	

}

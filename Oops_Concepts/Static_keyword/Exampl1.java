package Oops_Concepts.Static_keyword;

/*
 * static variables memory allocated during class loading and subsystem stage,
 * so they are object independent.
 *  can call using class name.
 */

class Dog{
	static String name;
	static int cost;
	
	
	static void display() {
		System.out.println("inside a static display method");
	}
}
public class Exampl1 {
	public static void main(String[] args) {
		
		System.out.println(Dog.name);
		System.out.println(Dog.cost);
		Dog.display();
	}

}

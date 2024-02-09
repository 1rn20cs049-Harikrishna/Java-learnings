package Oops_Concepts.Construction;

/*
 * Topics covered
 * 1.constructor chaining
 * 2.super()
 * 3.this()
 */

class Parent{
	 public Parent(){
		 System.out.println("call made from super() of child class constructor");
	}
}

class Child extends Parent {
	public Child() {
		super();
		System.out.println("after calling parent class constructor using super()");
	}
	
}


class Dog{
	private String name;
	private int cost;
	
	public Dog() {
		this("Sheru", 20000);
		System.out.println("control returned from Dog(name,cost)");
	}
	
	public Dog(String name, int cost) {
		this.name=name;
		this.cost=cost;
		System.out.println("Control was passed from Dog()");
	}

	//getters
	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
	
}
public class Example3 {
	public static void main(String[] args) {
		 Dog d1 = new Dog();
		 System.out.println("control back to main");
		 System.out.println(d1.getName());
		 System.out.println(d1.getCost());
		 
		 Child c1= new Child();
		 System.out.println("back to main,  Terminate");
		 
	}

}

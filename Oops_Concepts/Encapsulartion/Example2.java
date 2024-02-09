package Oops_Concepts.Encapsulartion;

/*
 * Topics covered
 * 1. common setters
 * 2.common getters
 */

class Dog{
	
	private String name;
	private int cost;
	
	/*setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	*/
	
	
	
	//common setters
	public void setData(String name, int cost) {
		this.name=name;
		this.cost=cost;
	}
	
	
	/*
	 * common getters is post possible because there is conflict between return type.
	 */
	
	//getters
	public int getCost() {
		return cost;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
public class Example2 {
	public static void main(String[] args) {
		
		Dog d1= new Dog();
		d1.setData("Sheru", 200000);
		
		System.out.println(d1.getName());
		System.out.println(d1.getCost());
		
	}

}


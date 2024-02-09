package Oops_Concepts.Encapsulartion;


/* topics Covered
 * 
 * 1.private
 * 2.Setters
 * 3.Getters
 * 4.this keyword
 * 
 */

class Student{
	
	//Has -Part
	private String name;
	private int age;
	int regNo;
	String address;
	boolean married;
	
	//setters
	public void setName(String name){
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setregNo(int regNo) {
		this.regNo = regNo;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	// when there is boolean return type make use of is in place of get.
	public void isMarried(boolean married) {
		this.married=married;
	}
	
	
	//getters
	 public String getName() {
		 return name;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
	 public int getRegNo() {
		 return regNo;
	 }
	 
	 public String getAddress() {
		 return address;
	 }
	 
	 public boolean getMarried() {
		 return married;
	 }
	
	
}
public class Example1 {
	public static void main(String args[]) {
		
		//object creation using new Keyword
		Student std1 = new Student();
		
		std1.setName("Akash");
		std1.setAge(22);
		std1.setregNo(400);
		std1.setAddress("Bangalore");
		std1.isMarried(false);
		
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		System.out.println(std1.getRegNo());
		System.out.println(std1.getAddress());
		System.out.println(std1.getMarried());
		
		}
	

}

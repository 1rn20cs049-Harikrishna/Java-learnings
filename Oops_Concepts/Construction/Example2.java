package Oops_Concepts.Construction;
class Student1{
	private String name;
	private int age;
	private int regNo;
	
	
	/*
	 * Topics
	 * 1.constructor
	 * it is specialized setter , it should be same as class name.
	 * 
	 * 2.constructor Overloading
	 */
	public Student1( String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	//constructor overloading
	public Student1( String name, int age , int regNo) {
		this.name=name;
		this.age=age;
		this.regNo=regNo;
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
	
	
	
}
public class Example2 {
	public static void main(String args[]) {
		
		//object instantiation makes a call to a constructor.
		Student1 s1= new Student1("Akash" , 22);
		Student1 s2= new Student1("Akash",22,400);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		System.out.println("----------------------");
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getRegNo());
	}

}


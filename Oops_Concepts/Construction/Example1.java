package Oops_Concepts.Construction;
class Student{
	private String name;
	private int age;
	private int regNo;
	
	
	/*
	 * constructor
	 * it is specialized setter , it should be same as class name.
	 */
	public Student( String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Student( String name, int age , int regNo) {
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
	
	
	
}
public class Example1 {
	public static void main(String args[]) {
		
		//object instantiation makes a call to a constructor.
		Student s1= new Student("Akash" , 22);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}

}

package interfaces;

interface Parent {
	

	public void read();
	public void write();
	
	/* we can have method with body but we have to compulsory
	 * make it as default.
	 *  but still it is public because interface nature.
	 */
	
	 default void disp1() {
		System.out.println("In default method");
	}
	 
	 /*We can also have staric method*/
	  static void disp2() {
		  System.out.println("Inside satic method");
	  }
}

class  Child implements Parent {
	public void read() {
		
	}
	public void write() {
		
	}
}
public class MethodsWithBody  {
	public static void main(String[] args) {
		Child c = new Child();
		c.disp1();
		c.read();
		c.write();
		
		Parent.disp2();
	}

}

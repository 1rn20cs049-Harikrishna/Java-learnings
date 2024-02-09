package exception_Handling;

import java.util.Scanner;

/*There are 3 methods to know the information of an exception.
 * 1.getMessage(): prints the description of the Exception object.
 * 2.toString() : prints and and description of the exception object .
 * 3.printStachTrace(): prints name,discription and also the stack trace of an exception object.
 */

class Demo{
	public void divide() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Connection to Calculator Application is established");
			
			System.out.println("Enter the 1st Number to Divide");
			int num1 = sc.nextInt();
		
			System.out.println("Enter the 2st Number to Divide");
			int num2 = sc.nextInt();
			
			
			try {
			int res = num1/num2;
			System.out.println("Result is: "+ res);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				//e.printStackTrace();
			}
			
			
			System.out.println("connection Terminated");
			sc.close();
		}
	}
public class ExceptionInfoMethods {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.divide();
	}

}

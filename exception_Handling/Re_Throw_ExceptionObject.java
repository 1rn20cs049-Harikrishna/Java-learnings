package exception_Handling;
/*note : If the exception object is handled then it is not propogated to caller.
 * what if there is a need ,after handling the object we have to propogate to the caller.
 * use re_throwing an exception concept..
 */

import java.util.Scanner;

class Alpha2{
	public void alpha()throws ArithmeticException {
		
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
				System.out.println("Handled exception in alpha only");
				throw e;
			}
			
			finally {
			
			System.out.println("connection Terminated");
			sc.close();
			}
		}
	}

public class Re_Throw_ExceptionObject {
	public static void main(String[] args) {
		try {
			Alpha2 a = new Alpha2();
			a.alpha();
		}
		catch(ArithmeticException e) {
			System.out.println("handled exception in main");
		}
	}

}

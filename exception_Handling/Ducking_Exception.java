package exception_Handling;
/*Ducking the Exception:
 * is kind of ignoring it,we have provide information about the exception to the caller by using throws keyword..
 * for unchecked exceptions we have to handle it.
 */
import java.util.Scanner;

class Alpha1{
	public void alpha() throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection to Calculator Application is established");
		
		System.out.println("Enter the 1st Number to Divide");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2st Number to Divide");
		int num2 = sc.nextInt();
		
		int res = num1/num2;
		System.out.println("Result is: "+ res);
		
		
		
		sc.close();
	}
	
}

class Beta{
	public void beta() throws ArithmeticException{
		Alpha1 a = new Alpha1();
		a.alpha();
	}
	
}
public class Ducking_Exception {
	public static void main(String[] args) {
		try {
			Beta b = new Beta();
			b.beta();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception occured,Handled in main");
		}
		System.out.println("connection Terminated");
		
	}

}

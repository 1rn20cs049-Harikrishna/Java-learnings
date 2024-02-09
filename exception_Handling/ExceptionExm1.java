package exception_Handling;
import java.util.Scanner;

/*Exception :
 *  Exception is an unwanted event that occurs during runtime .
 *  and it leads to abnormal termination of  an Application.
 */
public class ExceptionExm1 {
	public static void main(String[] args) {
		
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
		catch(Exception e) {
			System.out.println("You are trying to divide the number by Zero illogical");
		}
		
		
		System.out.println("connection Terminated");
		sc.close();
	}

}

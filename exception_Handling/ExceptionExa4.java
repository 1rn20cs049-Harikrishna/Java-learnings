package exception_Handling;

import java.util.Scanner;

class Alpha{
	public void alpha() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection to Calculator Application is established");
		
		System.out.println("Enter the 1st Number to Divide");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2st Number to Divide");
		int num2 = sc.nextInt();
		
		int res = num1/num2;
		System.out.println("Result is: "+ res);
		
		
		System.out.println("connection Terminated");
		sc.close();
	}
}
public class ExceptionExa4 {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.alpha();
		
	}

}


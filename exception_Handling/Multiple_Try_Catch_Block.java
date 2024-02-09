package exception_Handling;

import java.util.Scanner;

public class Multiple_Try_Catch_Block {
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
		catch(ArithmeticException ae) {
			System.out.println("You are trying to divide the number by Zero illogical");
		}
		
		
		System.out.println("Enetr the size of an array");
		int a[];
		
		try {
		int size = sc.nextInt();
		a = new int[size];
		System.out.println("Enter the element for an array");
		int elem = sc.nextInt();
		System.out.println("Enter the position to be inserted");
		int pos =sc.nextInt();
		a[pos]=elem;
		System.out.println("elem" + elem);
		}
		catch(NegativeArraySizeException nbe) {
			System.out.println("You are trying to enter a negative size for an array ,which is illogical.");
			}
		catch(ArrayIndexOutOfBoundsException abe) {
			System.out.println("you are exceding the limits.");
		}
		catch(Exception e) {
			System.out.println("Wrong input!");
		}
		
		
		
		System.out.println("connection Terminated");
		sc.close();
		
		}
		
		
		

}

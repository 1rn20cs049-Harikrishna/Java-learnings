
package exception_Handling.custom_Exception;

import java.util.Scanner;

class UnderAgeException extends Exception {
	public UnderAgeException(String message) {
		super(message);
	}
	
}

class OverAgeException extends Exception {
	public OverAgeException(String message) {
		super(message);
	}
	
}
class Aplicant 
{
	int age;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		age=sc.nextInt();
	}
	
	public void verify()throws OverAgeException, UnderAgeException {
		if(age<18)
		{
			UnderAgeException uae = new UnderAgeException ("you are to young! ");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60)
		{
			OverAgeException oae = new OverAgeException ("you are too Old ");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("You are eligible");
		}
	}
}

class RTO {
	public void initiate() {
		Aplicant a = new Aplicant();
		try {
		a.input();
		a.verify();
		}
		catch(UnderAgeException |OverAgeException  e)
		{
			try {
				a.input();
				a.verify();
				}
				catch(UnderAgeException |OverAgeException e1)
				{
					System.out.println("Plz read Rules");
					System.exit(0);
				}
		}
	}
}
public class LaunchCE2 {
	public static void main(String[] args) {
		RTO r = new RTO();
		r.initiate();
	}

}

package exception_Handling.custom_Exception;
import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	/*public InvalidCustomerException(String msg)
	{
		super(msg);
	}*/

}
class Atm
{
	int userid=1212;
	int password=1111;
	int pw;
	int uid;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kindly enter the user id");
		uid=scan.nextInt();
		
		System.out.println("Kindly enter the pasword");
		pw=scan.nextInt();	
	}
	public void verify() throws InvalidCustomerException
	{
		if((userid== uid) && (password == pw))
		{
			System.out.println(" please Take your cash");
		}
		else
		{
			//InvalidCustomerException ice=new InvalidCustomerException("Are you sure? try again bcz wrong input");
			//System.out.println(ice);
			InvalidCustomerException ice=new InvalidCustomerException();
			System.out.println(ice);
			//System.out.println(ice.getMessage());
			throw ice;
		}
	}
}

class Bank
{
	public void initiate()
	{
		Atm a=new Atm();
		try 
		{
			a.input();
			a.verify();
		
		} 
		catch (InvalidCustomerException e1)
		{
			try 
			{
				a.input();
				a.verify();
			
			} 
			catch (InvalidCustomerException e2)
			{
				try 
				{
					a.input();
					a.verify();
				
				} 
				catch (InvalidCustomerException e3)
				{
					
					System.out.println("card  blocked!!");
					System.exit(0);
				}
				
			}
			
		}
	}
}
public class LaunchCE1 {

	public static void main(String[] args) {
		 
		Bank b=new Bank();
		b.initiate();

	}

}

package exception_Handling;

public class Ex1 {
	public static void main(String args []) {
		int a=10;
		int b=0;
		int c= 10;
		int d=0;
		
		try {
			System.out.println("st 1");
			System.out.println("st 2");
			
			int res1=a/b;
			try {
				int res2=c/d;
			}
			catch(ArithmeticException e) {
				System.out.println("exception in innner try");
			}
			finally {
				System.out.println("close resource");
			}
				
			}
		catch(NegativeArraySizeException nbe) {
			System.out.println("exception in outer  try");
			
		}
		finally {
			System.out.println("close resource");
		}
			
		
		
	}

}

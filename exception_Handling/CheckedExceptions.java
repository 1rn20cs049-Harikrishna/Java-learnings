package exception_Handling;
/*Checked exceptions :
 * 	It will be checked by compiler during compile time,it mandatory to provide handler or duck it...
 * Developer usually Duck the checked exceptions..
 */
public class CheckedExceptions {
	public static void main(String[] args)throws Exception {//Ducking 
		Thread.sleep(4000);
		System.out.println("After 4 seconds....");
	}

}

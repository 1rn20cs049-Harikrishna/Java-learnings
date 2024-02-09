package ioOpertrations.fileWritter;

import java.io.File;
import java.io.FileWriter;

public class FileWritter1 {
	public static void main(String[] args) throws Exception {
		
	File f= new File("b.txt");
	FileWriter f1= new FileWriter(f,true);
	//System.out.println(f.exists());
	
	/*constructors.
	 * public class java.io.FileWriter extends java.io.OutputStreamWriter {
	  public java.io.FileWriter(java.lang.String) throws java.io.IOException;
	  public java.io.FileWriter(java.lang.String, boolean) throws java.io.IOException;
	  public java.io.FileWriter(java.io.File) throws java.io.IOException;
	  public java.io.FileWriter(java.io.File, boolean) throws java.io.IOException;
	 */
	
	
	/*write methods
	 *   public void write(int) throws java.io.IOException;
		  public void write(char[], int, int) throws java.io.IOException;
		  public void write(java.lang.String, int, int) throws java.io.IOException;
	 */
	
	f1.write(97);
	f1.write("\n");
	f1.write("hello Akash");
	f1.write("\n");
	char ch[]= {'p','w','s','k'};
	f1.write(ch);
	
	f1.flush();
	System.out.println("open the file to see results");
	}

}

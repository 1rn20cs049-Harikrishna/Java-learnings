package ioOpertrations;

import java.io.File;

/*public java.io.File(java.lang.String);
  public java.io.File(java.lang.String, java.lang.String);
  public java.io.File(java.io.File, java.lang.String);
  public java.io.File(java.net.URI);
  */
public class FileEx1  {
	public static void main (String[] args) throws Exception {
		String filename="abc.txt";
		File f=new File(filename);
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
	}

}

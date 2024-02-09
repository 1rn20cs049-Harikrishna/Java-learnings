package ioOpertrations;

import java.io.File;

public class FileInDir {
	public static void main(String[] args) throws Exception{
		File f = new File("INeuron");
		f.mkdir();
		System.out.println(f.isDirectory());
		
		File f1=new File(f,"abc.txt");
		f1.createNewFile();
		System.out.println(f1.isFile());
	}

}

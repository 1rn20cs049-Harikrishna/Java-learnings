package ioOpertrations;

import java.io.File;

public class CustomDir {
	public static void main(String[] args)throws Exception {
		String location="c:\\pwskills";
		File f=new File(location);
		f.mkdir();
		
		File f1=new File(f,"java.txt");
		String []a=f.list();
		for(String elem: a){
			System.out.println(elem);
		}
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.length());
	}

}

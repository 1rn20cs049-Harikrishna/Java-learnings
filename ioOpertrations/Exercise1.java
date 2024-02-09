package ioOpertrations;

import java.io.File;

/*check and display file names in C:\pwskills*/
public class Exercise1 {
	public static void main(String[] args) {
		int dircount=0;
		int filecount=0;
		String location="C:\\pwskills";
		File f = new File(location);
		String names[]=f.list();
		for(String name:names) {
			File f1= new File(f,name);
			if(f1.isDirectory())
				dircount++;
			else
				filecount++;
			System.out.println(name);
		
		}
		System.out.println(dircount);
		System.out.println(filecount);
	}

}

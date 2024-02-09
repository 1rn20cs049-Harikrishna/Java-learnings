package ioOpertrations.fileReader;

import java.io.FileReader;

public class Filereader1 {
	public static void main(String[] args) throws Exception {
		
		FileReader f= new FileReader("abc.txt");
		int i=f.read();
		while(i!=-1) {
		System.out.print((char)i);
		i=f.read();
		}
		
	}

}

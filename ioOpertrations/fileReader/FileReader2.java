package ioOpertrations.fileReader;

import java.io.File;
import java.io.FileReader;

/*read(char[])*/
public class FileReader2 {
	public static void main(String[] args)throws Exception {
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		char ch[]=new char[(int)f.length()];
		fr.read(ch);
		for(char data:ch) {
			System.out.print(data);
		}
		fr.close();
	}

}

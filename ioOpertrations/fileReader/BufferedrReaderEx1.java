package ioOpertrations.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedrReaderEx1 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("bc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line =br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		
		
		
	}

}

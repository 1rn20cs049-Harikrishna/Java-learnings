package ioOpertrations.fileWritter;
import java.io.*;
/*requirement copy 2 file(file1.txt,file2.txt) contents to the new file(file3.txt)*/

import java.io.FileReader;

public class Exercise1 {
	public static void main(String[] args) throws Exception{
		/*one approach
		 * File f= new File("bb.txt");
		FileReader fr1 = new FileReader(f);
		BufferedReader br = new BufferedReader(fr1);
		char ch []= new char[(int)f.length()];
		br.read(ch);
		
		FileWriter fw = new FileWriter("file3.txt");
		BufferedWriter bw = new BufferedWriter(fw) ;
		bw.write(ch);
		
		br.close();
		bw.close();*/
		
		PrintWriter pw = new PrintWriter("File4.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		
		 BufferedReader brr = new BufferedReader(new FileReader("bc.txt"));
		 line=brr.readLine();
		while(line!=null) {
			pw.println(line);
			line=brr.readLine();
		}
		pw.flush();
		brr.close();
		br.close();
		pw.close();
		
	}

}

package ioOpertrations.fileWritter;
/*take one line from both the files and paste it to file4*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Excersise2 {
	public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("File5.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String line=br.readLine();
		
		
		BufferedReader brr = new BufferedReader(new FileReader("bc.txt"));
		String line1=brr.readLine();
		
		while(line !=null || line1!=null) {
			if(line!=null) {
			pw.println(line);
			line=br.readLine();
			}
			if(line1!=null) {
			pw.println(line1);
			line1=brr.readLine();
			}
		}
		 
		 
		pw.flush();
		brr.close();
		br.close();
		pw.close();
		
	}

}

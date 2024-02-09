package ioOpertrations.fileWritter;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterEx1 {
	public static void main(String[] args) throws Exception{
		FileWriter fw= new FileWriter("bb.txt",true);
		PrintWriter out = new PrintWriter(fw);
		out.write("Akash");
		out.write(100);
		out.write("\n");
		
		out.println(100);
		out.println(true);
		out.println(10.00);
		out.println('c');
		
		out.flush();
		out.close();
		System.out.println("open file to check output");
		
	}

}

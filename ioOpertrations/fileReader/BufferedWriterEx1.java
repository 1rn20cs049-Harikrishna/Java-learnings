package ioOpertrations.fileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx1 {
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("bc.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(105);
		bw.write("neuron");
		bw.newLine();
		bw.write("hello buffered Writer");
		bw.flush();
		bw.close();
		System.out.println("check output in file");
	}

}

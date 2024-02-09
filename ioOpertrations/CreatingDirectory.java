package ioOpertrations;

import java.io.File;

public class CreatingDirectory {
	public static void main(String[] args) {
		String directoryName ="IPLTeams";
		File f= new File(directoryName);
		System.out.println(f.exists());
		
		f.mkdir();
		System.out.println(f.exists());
		
		
		
	}

}

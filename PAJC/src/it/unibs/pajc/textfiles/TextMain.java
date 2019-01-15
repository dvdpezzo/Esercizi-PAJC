package it.unibs.pajc.textfiles;

import java.io.*;

public class TextMain {
	public static void main(String[] args) {
		File directory = new File("/txtFiles/");
		File[] files = directory.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.toLowerCase().endsWith(".txt");
		    }
		});
		
		

	}
	
	

}

package it.unibs.pajc.textfiles;

import java.io.*;

public class TextUtils {
	
	public static int wordOccurrency(File f) {
		int occurrency=0;
		File toRead = f;
		FileReader reader;
		BufferedReader bReader;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new FileReader(f);
			bReader = new BufferedReader(reader);
			String read = bReader.readLine();
		    while (read != null) {
		        sb.append(read).append("\n");
		        read = bReader.readLine();
		      }

		      String fileAsString = sb.toString();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return occurrency;
	}

}

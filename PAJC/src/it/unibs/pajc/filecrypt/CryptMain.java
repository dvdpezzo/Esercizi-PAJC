package it.unibs.pajc.filecrypt;

import it.unibs.fp.mylib.InputDati;
import java.io.*;

public class CryptMain {

	public static void main(String[] args) {
		String s;
		s = InputDati.leggiStringaNonVuota("Inserisci una frase: ->");
		Crypter c = new Crypter(3);
		s=c.crypt(s);
		File file;
		FileWriter fw=null;
		try {
			file = new File("crypted.txt");
			fw = new FileWriter(file);
			fw.write(s);

		}
		catch(IOException ex) {
			System.out.println("An exception has occurred");
		}
		finally {
			try {
			fw.flush();
			fw.close();
			}
			catch(Exception ex) {
				System.out.println("An exception has occurred");
			}
		}
	}

}

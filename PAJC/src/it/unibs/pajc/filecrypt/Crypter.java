package it.unibs.pajc.filecrypt;

public class Crypter {
	int key;
	int index;
	String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	String stringa = "";
	
	public Crypter (int key) {
		this.key = key;
	}
	
	public String crypt(String s) {
		for(int i=0;i<s.length();i++) {
			char at = s.charAt(i);
			if(at == ' ') stringa = stringa + ' ';
			index = alfabeto.indexOf(at);
			at = alfabeto.charAt(index + key);
			stringa = stringa+ at;
		}
		return stringa;
	}
}

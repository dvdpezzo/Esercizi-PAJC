package it.unibs.pajc.library;

public class Book {
	String title;
	int code;
	User assigned = null;
	String autore;
	
	public Book(String title, String autore,int code) {
		this.setTitle(title);
		this.setAuthor(autore);
		this.setCode(code);
	}
	
	public void setUser(User u) {
		this.assigned = u;
	}
	
	public void setTitle(String title) {
	
		this.title = title;
	}
	
	public void freeBook() {
		assigned = null;
	}
	
	public User getUser() {
		return this.assigned;
	}
	
	public void setCode(int c) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public void setAuthor(String a) {
		this.autore=a;
	}
	
	public String getAuthor() {
		return this.autore;
	}
}

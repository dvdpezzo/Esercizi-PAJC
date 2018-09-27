package it.unibs.pajc.library;

public class User {
	String name;
	String surname;
	
	public User(String name, String surname) {
		this.setName(name);
		this.setSurname(surname);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}

}

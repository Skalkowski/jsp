package com.example.servletjspdemo.domain;

public class Person {
	
	private String firstName = "unknown";
	private String lastName = "unknown";
	private String plec = "k";
	private int yob = 1900;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, String plec, int yob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yob = yob;
		this.plec = plec;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setPlec(String plec){
		this.plec  = plec;
	}
	
	public String getPlec(){
		return plec;
	}
	
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
}

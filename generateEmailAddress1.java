package com.gl.java;

public class generateEmailAddress1 {
	private String FirstName;
	private String LastName;
	private String Department;
	private String companySuffix="abc.com";
	private String email;
	
	public generateEmailAddress1(String firstName, String lastName, String dept) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Department = dept;
		
	}
 public String getEmail(){
	 email = FirstName+LastName+"@"+Department+"."+companySuffix;
	 return email;
	
 }

}

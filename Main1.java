package com.gl.java;
import java.util.Scanner;
import java.util.Random;
public class Main1 {
	 public static void main(String[] args) {
	    	
	    	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    	String lower = "abcdefghijklmnopqrstuvwxyz";
	    	String num = "0123456789";
	    	String specialChars = "<>,./!@#$%^&*()=-+";
	    	String combination = upper+lower+specialChars+num;
	    	int len = 8;
	    	char[] password = new char[len];
	    	Random r = new Random();
	    	for (int i=0; i<len; i++) {
	    		password[i] = combination.charAt(r.nextInt(combination.length()));
	    	}
	    	System.out.println("Please enter the department from the following");
	    	System.out.println("1.Technical");
	    	System.out.println("2.Admin");
	    	System.out.println("3.Human Resource");
	    	System.out.println("4.Legal");
	    	Scanner sc = new Scanner(System.in);
	    	int number = sc.nextInt();
	        generateEmailAddress1 mail = new generateEmailAddress1("harshit", "choudary", "tech");
	      
	        switch (number){
	    	 case 1:
	         System.out.println("Dear harshit your generated credentials are as follows");
	    	 System.out.println("Email -----> "+mail.getEmail());
	    	 System.out.println("Password ----->"+new String(password));
	    	 break;
	    	 
	    	 case 2:
	    	 System.out.println("Dear harshit your generated credentials are as follows");
	    	 System.out.println("Email -----> "+mail.getEmail());
	    	 System.out.println("Password ----->"+new String(password));
	    	 break;
	    	 
	    	 case 3:
	    	 System.out.println("Dear harshit your generated credentials are as follows");
	    	 System.out.println("Email ----->"+mail.getEmail());
	    	 System.out.println("Password ----->"+new String(password));
	    	 break;
	    	 
	    	 case 4:
	    	 System.out.println("Dear harshit your generated credentials are as follows");
	    	 System.out.println("Email ----->"+mail.getEmail());
	    	 System.out.println("Password ----->"+new String(password));
	    	 break;
	    		 
	    	 default:
	    		 System.out.println("Enter a valid number");
	     }      

	    
}
}

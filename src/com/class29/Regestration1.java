package com.class29;

public class Regestration1 {
	   private String email;
	   private String userName;
	   private String password;
	   public String getEmail() {
	       return email;
	   }
	   public void setEmail(String email) {
	       if (email.contains("gmail")) {
	           this.email = email;
	       } else {
	           System.out.println("Please provide only gmail");
	       }
	   }
	   public String getUserName() {
	       return userName;
	   }
	   public void setUserName(String userName) {
	       if (!userName.isEmpty()) {
	           if (userName.length() > 6) {
	               this.userName = userName;
	           } else {
	               System.out.println("Username should be more than 6 characters");
	           }
	       } else {
	           System.out.println("Username cannot be empty");
	       }
	   }
	   public String getPassword() {
	       return password;
	   }
	   public void setPassword(String password) {
	       //nested if-->if this check point is false no point to check other check poinyts
	       if (!password.isEmpty()) {
	           if (password.length() > 6) {
	               if (!password.contains(userName)) {
	                   this.password = password;
	               } else {
	                   System.out.println("Password cannot contain username");
	               }
	           } else {
	               System.out.println("Password should be more than 6 characters");
	           }
	       } else {
	           System.out.println("Password cannot be empty");
	       }
	   }
	   //works but it is not the best way
	//  public void setPassword1(String password) {
//	      if ((!password.isEmpty()) && password.length()>6 && (!password.contains(userName))) {
	//
//	      }
	//  }
	}
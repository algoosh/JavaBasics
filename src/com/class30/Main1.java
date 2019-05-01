package com.class30;

class EncapsulationDemo1{
	  // private long acc_no;  
	private String name;
	private String email;  
	//private float amount;

//	private long getAcc_no(){
//	  return acc_no;
//	}
	String getName(){
	  return name;
	}
	String getEmail(){
	  return email;
	 }
//	 private float getAmount(){
//	  return amount;
//	}
//	private void  setAcc_no(long a){
//	  this. acc_no=a;
//	}
	void setName(String b){
	  this. name=b;
	}
	void setEmail(String c){
	  this. email=c;
	 }
//	 private void setAmount(float d){
//	  this. amount=d;
//	 }
	 }
	class Main1 {
	  public static void main(String[] args) {
	    EncapsulationDemo1 obj=new EncapsulationDemo1();
	   // obj.setAcc_no(7560504000l);
	    obj.setName("Sumair");
	    obj.setEmail("sumair@syntaxsolutions.com");
	   // obj.setAmount(500000.0f);
	    System.out.println(/*obj.getAcc_no()+" "+*/obj.getName()+" "+obj.getEmail()/*+" "+obj.getAmount()*/);
	 
	  }
	}
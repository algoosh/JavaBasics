package com.class30;
class Demo{
	private long acc_no;
	private String name;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	private String email;
	private float amount;
	
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}  
}

public class Main2 {

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.setAcc_no(7560504000l);
		obj.setName("Samiar");
		obj.setEmail("sumair@syntaxsolutions.com");
		obj.setAmount(500000f);
		
		System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
		

	}

}

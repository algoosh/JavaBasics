package com.class23;

public class FrontEnd extends Developer {

	public void  doHtlm() {
		System.out.println("FrontEnd Developer does Htlm");
		
	}
	public static void main(String[] args) {
		BackEnd obj = new BackEnd();
		obj.doSql();
	}}
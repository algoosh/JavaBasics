package com.class23;

public class BackEnd extends Developer {


void  doSql() {
	System.out.println("BackEnd Developer does SQL");
	
}
public static void main(String[] args) {
	BackEnd obj = new BackEnd();
	obj.doSql();
}
}

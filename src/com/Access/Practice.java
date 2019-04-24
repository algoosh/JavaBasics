package com.Access;

public class Practice {
	public static void main(String[] args) {
		
	
	Bucket1 q=new Bucket1("Eggs",5,50);
	q.outputInfo();
	}	
}
class Bunny1{
	protected int level;
	protected String name;
	public Bunny1(String n,int l) {
		name=n;
		level=l;
	}
}
class Bucket1 extends Bunny1{
	private int flowers;
	
	public Bucket1(String n,int l,int flw) {
		super(n,l);
		flowers=flw;
	}
	public void outputInfo() {
		//System.out.println("number of flowers "+flowers);
		System.out.println("number of names "+name);
		System.out.println("number of levels "+level);
	}
}

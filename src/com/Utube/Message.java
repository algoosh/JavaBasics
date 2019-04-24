package com.Utube;

public class Message {
Message(){
	System.out.println("hello   a");
}
Message( int p){
	this();
	System.out.println(""+p);
}
}
class ThisKeyword{
	Message y1 =new Message(13);
	
}
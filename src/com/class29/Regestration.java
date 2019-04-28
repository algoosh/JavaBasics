package com.class29;

public class Regestration {
    private String email="";
    private String userName="";
    private String password="";
    
    public String getUserName() {
        return userName;}
    
    public void setUserName() {
        if(!userName.isEmpty()) {
            this.userName=userName;}}
    public String getEmail() {
        return email;}
    
    public void setEmail(String email) {
        if(email.contains("gmail")) {
        this.email = email;}}
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(!password.isEmpty()) {
        this.password = password;}}
    
public static void main(String[] args) {
    Regestration obj=new Regestration();
    obj.setEmail("123gaggag@gmail.com");
    System.out.println(obj.email);
}
}

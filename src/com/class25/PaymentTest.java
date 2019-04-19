package com.class25;

public class PaymentTest {

public static void main(String[] args) {
    
    Payment parent = new Payment();
    MasterCard mc = new MasterCard();
    VisaCard vs= new VisaCard();
    
    parent.makePayment();
    mc.makePayment();
    vs.makePayment();
    vs.annuaelFee();
    //Achieving run time polymorhpism
    //pay is out reference variable and Payment is our type
    //new MasterCard --creating a new object
    Payment pay=new MasterCard();
    //any method that exist in parent and common in child
    pay.closePayment();
    pay.makePayment();
    
    Payment pay1=new VisaCard();
    pay1.closePayment();
    
   // pay1.annuaelFee();
}
}

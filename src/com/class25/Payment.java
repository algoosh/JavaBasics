package com.class25;

public class Payment {
    
    public void makePayment() {
        System.out.println("We can make a payment with no fee");
    }
    public void closePayment() {
    	System.out.println("Paymets needs to be closed");
    }
}

class MasterCard extends Payment{
    @Override
    public void makePayment() {
        System.out.println("We can make payment with MC and 2%fee");
    }
}
class VisaCard extends Payment{
    @Override
    public void makePayment() {
        System.out.println("We can make payment with visa and 1.5%fee");
    }
    public void annuaelFee() {
        System.out.println("Visa card has an annual fee");
    }
}
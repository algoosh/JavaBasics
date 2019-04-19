package com.class24;

public class Programming {

    /*
     * Task 1
     * Create a class named ‘Programming’. While creating an object of the
     * class, if nothing is passed to it--->“I love programming languages” 
     * If some String is passed to it, then in place
     * of “programming languages” the value variable should be printed. Example, if
     * we pass “Java”, then “I love Java” should be printed.
     */

    void getData() {
        System.out.println("I am female");
    }

    public void getData(int x) {
        System.out.println("My age is " + x);
    }

    public static void main(String[] args) {

        Programming obj = new Programming();
        obj.getData();
        obj.getData(30);

    }
}
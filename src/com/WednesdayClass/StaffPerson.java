package com.WednesdayClass;
/*A university department consists of professors and secretaries.
 *  Each professor and each secretary has a name, a salary, and a hire date. 
 *  Use inheritance and polymorphism to create an application that represents the department
 *   and its professors and secretaries as objects, and provides a test class that 
 *   creates 3 professors and 2 secretaries, 
 *   and then outputs the combined total of all of their salaries.
 */

public abstract class StaffPerson {
    String name;
    String adress;
    int salary;
    String vehicleType;
    String hireDate;
    int tellNum;

    public StaffPerson(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super();
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.vehicleType = vehicleType;
        this.hireDate = hireDate;
        this.tellNum = tellNum;
    }

    public abstract String getVehicleType();

    public abstract String getName();

    public abstract String getAddress();

    public abstract double getSalary();

    public abstract int getTellNum();

}
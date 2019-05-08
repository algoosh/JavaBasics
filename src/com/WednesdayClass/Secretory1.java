package com.WednesdayClass;

public class Secretory1 extends StaffPerson1 {

	public Secretory1(String name, double salary, String vehicleType, String hireDate, String tellNum) {
        super(hireDate,salary, hireDate, vehicleType, tellNum);
    
	}

	@Override
	public String getName() {
		
		return super.name;
	}

	@Override
	public String gerHireDate() {
		
		return super.hireDate;
	}

	@Override
	public double getSalary() {
        return super.salary;
	}
	@Override
	public String getTellNumberget() {
		
		return super.tellNumber;
	}

	@Override
	public String getVehicleType() {
		
		return super.vehicleType;
	}

	
}

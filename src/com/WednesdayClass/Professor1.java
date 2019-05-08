package com.WednesdayClass;

public  class Professor1 extends StaffPerson1 {

	public Professor1(String name, double salary, String vehicleType, String hireDate, String tellNum) {
        super(hireDate,salary, hireDate, vehicleType, tellNum);
    }

    @Override
    public String getVehicleType() {
        return super.vehicleType;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public double getSalary() {
        return super.salary;
    }

    
    public String getTellNum() {
        return super.tellNumber;
    }

	@Override
	public String gerHireDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTellNumberget() {
		// TODO Auto-generated method stub
		return null;
	}

}
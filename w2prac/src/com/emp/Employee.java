package com.emp;

public class Employee {
	int id;
	StringBuilder name;
	double salary;
	double bonus;
	boolean status;
	Employee(){
		name = new StringBuilder();
	}
	public Employee(int nid, String nname, double nsalary, double nbonus, boolean nactive){
		if(nsalary <= 0) {
			throw new IllegalArgumentException("Invalid salary amount");
		}
		id = nid;
		name = new StringBuilder(nname);
		salary = nsalary;
		bonus = nbonus;
		status = nactive;
	}
	public void setName(String newName) {
		name = new StringBuilder(newName);
	}
	public String reversedName() {
		return name.reverse().toString();
	}
	public String getName() {
		return name.toString().toUpperCase();
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public double getBonus() {
		return salary * (bonus/100.0);
	}
	public double getFinalSalary() {
		return salary + getBonus();
	}
	public boolean getActive() {
		return status;
	}
	public boolean getOver75T() {
		return getFinalSalary() > 75000.0;
	}
	@Override
	public String toString() {
		return "Employee ID: " + id +
				"\nEmployee Name: " + getName() +
				"\nBasic Salary: " + getSalary() +
				"\nBonus: " + getBonus() +
				"\nFinal Salary: " + getFinalSalary() +
				"\nActive: " + getActive() +
				"\nReversed Name: " + reversedName() +
				"\nSalary above 75000: " + (getOver75T() ? "Yes" : "No");
	}
}

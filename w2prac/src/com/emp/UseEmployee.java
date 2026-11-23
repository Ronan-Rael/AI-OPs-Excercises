package com.emp;

public class UseEmployee {
	
	static {
		System.out.println("I am a static block");
	}

	public static void main(String[] args) {
		Employee empObj = new Employee();
		System.out.println(empObj.id);
		System.out.println(empObj.name);
		System.out.println(empObj.salary);
		
		Employee rahul1 = new Employee(101, "Rahul", 60000, 20, true);
		Employee rahul2 = new Employee(101, "Rahul", 60000, 20, true);
		
		System.out.println(rahul1.equals(rahul2));
		
		rahul1 = null;
		rahul2 = null;
		
		System.gc();
		System.out.println("main method completed");
	}
	
	
}

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
	}

}

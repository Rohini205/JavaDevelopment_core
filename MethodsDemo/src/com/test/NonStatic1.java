package com.test;

public class NonStatic1 {
	String test(String name) {
		System.out.println("My name is >> "+name);
		return name;
	}
	public static void main(String[] args) {
		NonStatic1 obj1=new NonStatic1();
		obj1.test("Rohini");
		
	}
}

package com.test;

public class NonStaticMethod {
	
	public int Example(int num) {
		System.out.println("The value of the >>" + num);
		System.out.println("This is the NonStatic method");
		return num;
	}
	public static void main(String[] args) {
		NonStaticMethod obj=new NonStaticMethod();
		obj.Example(12);
}
}

package com.test;

public class StaticMethod {
	
	public static void test(){
		System.out.println("This is static Method");
		
	}
	public static void main(String[] args) {
		
		StaticMethod obj=new StaticMethod();//creating the object to call the method
		obj.test();  //calling the object
		
		StaticMethod.test();
		
		
		
	}

}

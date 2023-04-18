package com.test;

public class NonStatic2 {
	String getStudent(String Fname,String Lname) {
		String Fullname=Fname+" "+Lname;
		System.out.println("My fullname is >> "+Fullname);
		return Fullname;
		
	} 
	public static void main(String[] args) {
		NonStatic2 obj2=new NonStatic2();
		obj2.getStudent("Rohini","Tibile");
		
	}

}

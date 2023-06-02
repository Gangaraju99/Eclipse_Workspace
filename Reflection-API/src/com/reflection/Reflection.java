package com.reflection;


class Employee{
	private int empId;
	String name;
}


public class Reflection {
	public static void main(String[] args) throws Exception {
		
		 Employee e = new  Employee();
		
		 Class<?> name = Class.forName("com.reflection.Employee");
		 System.out.println(name);
		 
		Object obj =  name.newInstance();
		Employee emp =  (Employee)obj;
		 
		 
		
		
	}

	private static void Employee(Object o) {
		// TODO Auto-generated method stub
		
	}

}

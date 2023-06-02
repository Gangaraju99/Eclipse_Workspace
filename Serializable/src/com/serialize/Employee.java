package com.serialize;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empno;
	private String ename;
	private double sal;
	private static String company;
	
	public Employee(int empno, String ename, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	

}

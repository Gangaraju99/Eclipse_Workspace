package Oops;

 class Employee {

	private int empId;
	private String empName;
	private String role;

	public Employee(int empId, String empName, String role) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.role = role;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

 class FulltimeEmployee extends Employee {
	private int salary;

	public FulltimeEmployee (int empId, String empName, String role, int salary) {
		super( empId,empName, role);
		this.salary = salary;

	}

	public void displayFulltimeEmployee() {
		System.out.println(" empid:" + super.getEmpId());
		System.out.println("empname:" + super.getEmpName());
		System.out.println("role:" + super.getRole());
		System.out.println("salary:" + this.salary);

	}

}

 class ParttimeEmployee extends Employee {
	private double wagePerHour;

	public ParttimeEmployee(int empId, String empName, String role, double wagePerHour) {
		super(empId, empName, role);
		this.wagePerHour = wagePerHour;

	}

	public void displayParttimeEmployee() {
		System.out.println("empid:" + super.getEmpId());
		System.out.println("empname:" + super.getEmpName());
		System.out.println("role:" + super.getRole());
		System.out.println("wageperhour:" + this.wagePerHour);
	}

}

public class Generalization$Specialization {

	public static void main(String[] args) {
		// generalization
		Employee e1 = new ParttimeEmployee(222, "ram", "manager", 5000.00);

		ParttimeEmployee pe = (ParttimeEmployee) e1;
		pe.displayParttimeEmployee();

	}
}

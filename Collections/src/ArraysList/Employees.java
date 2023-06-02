package ArraysList;

public class Employees {

	private int empno;
	private String ename;
	private int yearsInOrg;
	private String gender;
	public Employees(int empno, String ename, int yearsInOrg, String gender) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.yearsInOrg = yearsInOrg;
		this.gender = gender;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getYearsInOrg() {
		return yearsInOrg;
	}
	public void setYearsInOrg(int yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employees [empno=" + empno + ", ename=" + ename + ", yearsInOrg=" + yearsInOrg + ", gender=" + gender
				+ "]";
	}
	
	
}

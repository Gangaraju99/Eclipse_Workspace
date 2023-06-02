package ArraysList;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	private static List<Employees> findFemaleEmployees(List<Employees> lst) {

		List<Employees> lstOfFemales = new ArrayList<>();
		for (Employees e : lst) {
			if (e.getGender().equalsIgnoreCase("Female")) {
				lstOfFemales.add(e);
			} // end if

		} // end for
		return lstOfFemales;

	}

	private static List<Employees> findFresherEmployees(List<Employees> lst) {
		List<Employees> lstOfFreshers = new ArrayList<>();

		for (Employees e : lst) {
			if (e.getYearsInOrg() <= 1) {
				lstOfFreshers.add(e);
			} // end if

		} // end for
		return lstOfFreshers;

	}

	public static void main(String[] args) {

		List<Employees> lstEmp = new ArrayList<>();
		lstEmp.add(new Employees(7171, "Miller", 5, "Male"));
		lstEmp.add(new Employees(7211, "Neeta", 3, "Female"));
		lstEmp.add(new Employees(7191, "Arther", 4, "Male"));
		lstEmp.add(new Employees(7345, "scott", 6, "female"));
		lstEmp.add(new Employees(7676, "shreya", 1, "Male"));
		lstEmp.add(new Employees(7832, "mike", 3, "Male"));
		lstEmp.add(new Employees(7321, "david", 1, "Male"));
		lstEmp.add(new Employees(7896, "smith", 5, "female"));

		// invoke findFemaleEmployees();
		List<Employees> lstOfFemaleEmployees = findFemaleEmployees(lstEmp);
		// print the female employees
		for (Employees e : lstOfFemaleEmployees) {
			System.out.println(e);

		}

		System.out.println("******************************************");

		// invoke findFresherEmployees()
		List<Employees> lstOfFresherEmployees = findFresherEmployees(lstEmp);
		// print the fresher employees
		for (Employees e : lstOfFresherEmployees) {
			System.out.println(e);
		}

	}

}

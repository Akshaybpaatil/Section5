package com.cg.eis.bean5_1b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.cg.eis.bean5_1a.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	HashMap<Integer, Employee> employees = new HashMap<>();
	EmployeeService employeeService;

	@Override
	public void getEmployeeDetails() {
		Set s = employees.entrySet();
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

	}

	@Override
	public String getInsurenceDetails(Employee e) {
		if ((e.getSalary() > 5000 && e.getSalary() < 20000)
				|| e.getDesignation().equalsIgnoreCase("system associate")) {
			return "Scheme C";
		} else if ((e.getSalary() >= 20000 && e.getSalary() < 40000)
				|| e.getDesignation().equalsIgnoreCase("programmer")) {
			return "Scheme B";
		} else if (e.getSalary() >= 40000 || e.getDesignation().equals("manager")) {
			return "Scheme A";
		} else if (e.getSalary() < 5000 || e.getDesignation().equals("clerk")) {
			return "No Scheme";
		} else {
			System.out.println("invalid");
			return null;
		}

	}

	@Override
	public void addEmployee() {
		int n = 0;
		do {
			System.out.println("Enter employee detais");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter employee id");
			int id = scanner.nextInt();
			System.out.println("Enter employee name");
			String name = scanner.next();
			System.out.println("Enter employee salary");
			double salary = scanner.nextDouble();
			System.out.println("Enter employee designation");
			String designation = scanner.next();
			Employee employee = new Employee(id, name, salary, designation);
			employeeService = getEmployeeService();
			employee.setInsuranceScheme(employeeService.getInsurenceDetails(employee));
			System.out.println("Insurence Scheme is " + employee.getInsuranceScheme());
			employees.put(id, employee);
			System.out.println("Do you want to continue 1/0");
			n = scanner.nextInt();
		} while (n != 0);

	}

	private EmployeeService getEmployeeService() {
		if (employeeService == null) {
			employeeService = new EmployeeServiceImpl();
		}
		return employeeService;
	}

	@Override
	public void deleteEmployee(int id) {

	}

}

package com.cg.eis.bean5_1c;

import java.util.Scanner;

import com.cg.eis.bean5_1b.EmployeeService;
import com.cg.eis.bean5_1b.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.addEmployee();
		employeeService.getEmployeeDetails();
		System.out.println("Enter the id to remove employee");
		Scanner scanner = new Scanner(System.in);
		int  id = scanner.nextInt();
		employeeService.deleteEmployee(id);
		employeeService.getEmployeeDetails();

	}

}

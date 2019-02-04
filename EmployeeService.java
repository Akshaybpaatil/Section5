package com.cg.eis.bean5_1b;

import com.cg.eis.bean5_1a.Employee;

public interface EmployeeService {
	
	public void getEmployeeDetails();
	public String getInsurenceDetails(Employee e);
	public void addEmployee();
	public void deleteEmployee(int id);

}

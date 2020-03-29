package in.yadav.spring.service;

import in.yadav.spring.model.Employee;

public class EmployeeService {

	private Employee employee;

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee e) {
		this.employee = e;
	}
}
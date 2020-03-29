package in.yadav.springcollections;

public class Employee {
	private int employee_id;
	private String employee_name;
	private String employee_address;
	private String employee_location;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}

	public String getEmployee_location() {
		return employee_location;
	}

	public void setEmployee_location(String employee_location) {
		this.employee_location = employee_location;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_address="
				+ employee_address + ", employee_location=" + employee_location + "]";
	}
}
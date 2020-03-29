package in.yadav.oops;

/* 
 * 2.Write a program that achieves the Association oop's concepts.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  28-03-2020
 * */
class Bank {
	private String name;

	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}

class Employee {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName() {
		return this.name;
	}
}

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("SBI Bank");
		Employee emp = new Employee("Ritesh");

		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
	}
}
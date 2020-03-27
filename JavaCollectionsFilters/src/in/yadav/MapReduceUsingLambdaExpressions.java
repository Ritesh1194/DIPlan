package in.yadav;

/* 
 * 2.Map and Reduce example in Java 8 using lambda expressions.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  26-03-2020
 * */
import java.util.ArrayList;
import java.util.List;

public class MapReduceUsingLambdaExpressions {

	public static void main(String[] args) {

		// List Of Employees
		List<Employee> peoples = new ArrayList<>();
		peoples.add(new Employee(101, "Ritesh", 23));
		peoples.add(new Employee(102, "Raja", 21));
		peoples.add(new Employee(103, "Sudeep", 25));
		peoples.add(new Employee(104, "Rupesh", 27));
		peoples.add(new Employee(105, "Durga", 23));
		peoples.add(new Employee(106, "Prem", 22));
		peoples.add(new Employee(107, "Ravi", 224));

		double average = calculateAverage(peoples);
		System.out.println("Average age of employees are (classic way) : " + average);
		average = average(peoples);
		System.out.println("Average age of employees are (lambda way) : " + average);
	}

	/**
	 * Java Method to calculate average from a list of object without using *
	 * lambdas, doing it on classical java way.
	 */
	private static double calculateAverage(List<? extends Employee> employees) {
		int totalEmployee = employees.size();
		double sum = 0;
		for (Employee employee : employees) {
			sum += employee.getEmployee_age();
		}
		double average = sum / totalEmployee;
		return average;
	}

	/**
	 * Java method which uses map reduce to calculate average of list of *
	 * employees in JDK 8.
	 */
	private static double average(List<? extends Employee> peoples) {

		return peoples.stream().mapToInt(p -> p.getEmployee_age()).average().getAsDouble();
	}
}

// Employee Class

class Employee {
	private final int employee_id;
	private final String employee_name;
	private final int employee_age;

	public Employee(int employee_id, String employee_name, int employee_age) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_age = employee_age;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public int getEmployee_age() {
		return employee_age;
	}

}
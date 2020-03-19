package in.yadav.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		// 1) Iterating over a List and perform some operations
		List<String> list = new ArrayList<>();

		list.add("Ritesh");
		list.add("Ravi");

		list.forEach(value -> {
			System.out.println(value);
		});
		
		//Sorting employees objects by their name
		
		 Employee[] employees  = {
	              new Employee("Rajesh"),
	              new Employee("Bikash"),
	              new Employee("Prem"),
	              new Employee("Amresh")
	              };
	            
	          System.out.println("Before Sorting Names: "+Arrays.toString(employees));
	          Arrays.sort(employees, Employee::nameCompare);
	          System.out.println("After Sorting Names "+Arrays.toString(employees));
	      }
	}
	  
	class Employee {
	  String name;
	  
	  Employee(String name) {
	    this.name = name;
	  }
	  
	  public static int nameCompare(Employee a1, Employee a2) {
	    return a1.name.compareTo(a2.name);
	  }
	    
	  public String toString() {
	    return name;
	}
}
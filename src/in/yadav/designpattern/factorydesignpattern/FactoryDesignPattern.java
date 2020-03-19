package in.yadav.designpattern.factorydesignpattern;

import java.util.Scanner;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		GetPlan getPlan = new GetPlan();

		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input ");
		string = scanner.next();

		System.out.println("Enter Second Input ");
		int units = scanner.nextInt();
		Plan plan = getPlan.getPlan(string);

		System.out.println("Bill Amount " + string + "units" + units);
		plan.getRate();
		plan.calculateBill(units);
	}
}

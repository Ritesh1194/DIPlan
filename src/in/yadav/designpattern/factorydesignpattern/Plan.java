package in.yadav.designpattern.factorydesignpattern;

public abstract class Plan {
	double rate;

	public abstract double getRate();

	public void calculateBill(int units) {
		System.out.println(rate * units);
	}
}

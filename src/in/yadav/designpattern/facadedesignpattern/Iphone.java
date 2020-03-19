package in.yadav.designpattern.facadedesignpattern;

public class Iphone implements MobileShopInterface {

	@Override
	public void modelNo() {
		System.out.println("One Plus ");
	}

	@Override
	public void price() {
		System.out.println("50000");
	}
}
package in.yadav.designpattern.facadedesignpattern;

public class Samsung implements MobileShopInterface {

	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy");
	}

	@Override
	public void price() {
		System.out.println("10000");
	}
}
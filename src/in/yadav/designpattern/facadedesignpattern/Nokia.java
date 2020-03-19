package in.yadav.designpattern.facadedesignpattern;

public class Nokia implements MobileShopInterface {

	@Override
	public void modelNo() {
		System.out.println("Nokia 8");
	}

	@Override
	public void price() {
		System.out.println("40000");
	}
}
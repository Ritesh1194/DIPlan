package in.yadav.designpattern.facadedesignpattern;

public class ShopKeeper {
	private MobileShopInterface iPhone;
	private MobileShopInterface samsung;
	private MobileShopInterface nokia;

	public ShopKeeper() {
		iPhone = new Iphone();
		samsung = new Samsung();
		nokia = new Nokia();
	}

	public void iPhoneSale() {
		iPhone.modelNo();
		iPhone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void nokiaSale() {
		nokia.modelNo();
		nokia.price();
	}
}

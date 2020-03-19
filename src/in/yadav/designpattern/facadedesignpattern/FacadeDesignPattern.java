package in.yadav.designpattern.facadedesignpattern;

import java.util.Scanner;

public class FacadeDesignPattern {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		
		ShopKeeper shop = new ShopKeeper();

		System.out.println("<-------------Mobile Shop-------------->");
		System.out.println();
		System.out.println("1. Iphone Mobille Shop");
		System.out.println("2. Samsung Mobille Shop");
		System.out.println("3. Nokia Mobille Shop");
		
		System.out.println();
		System.out.println("Enter Your Choice ");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			shop.iPhoneSale();
			break;

		case 2:
			shop.samsungSale();
			break;

		case 3:
			shop.nokiaSale();
			break;

		default:
			System.out.println("Invalid Choice ");
		}
	}
}
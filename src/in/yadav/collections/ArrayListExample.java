package in.yadav.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// Adding The elements
		list.add("Ritesh");
		list.add("Raja");
		list.add("Raj");
		list.add("Rahul");

		// update the elements
		list.set(1, "Ravi");

		for (String array : list) {
			System.out.println("List Ofg Elements Are :  =  " + array);
		}

		// removing The elememts
		list.remove(3);

		System.out.println("Remove Elements Are : = " + list);

	}
}
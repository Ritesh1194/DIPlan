package in.yadav.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();

		// Adding The Elememnts
		tree.add("Ritesh");
		tree.add("Raj");
		tree.add("Raju");
		tree.add("Ravi");

		System.out.println("List Of Elements Are : = " + tree);

		// Remove The Elements
		tree.remove("Raj");

		System.out.println("After Removing : = " + tree);

		// Iterate The Elements Using ForEach Loop
		for (Object array : tree) {
			System.out.println("Iterate Elements Are : = " + array);
		}
	}

}

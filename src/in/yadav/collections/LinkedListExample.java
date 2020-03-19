package in.yadav.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// adding Elements
		list.add("Ritesh");
		list.add("Raja");
		list.add("Rahul");
		list.add("Ravi");

		System.out.println("List Of Elements Are " + list);

		// Update The Elements
		list.set(2, "Raj");
		System.out.println("Update Element " + list);

		// Iterate The elements Using ForEach Loop
		for (String array : list) {
			System.out.println("Iterate Elements Are " + array);
		}
		// Removing the Elements
		list.remove(3);
		System.out.println("Remove Elements Are " + list);
	}
}
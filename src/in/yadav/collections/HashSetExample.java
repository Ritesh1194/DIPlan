package in.yadav.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set set = new HashSet();

		// Adding The Elememnts
		set.add("Ritesh");
		set.add("Raj");
		set.add("Raju");
		set.add("Ravi");

		System.out.println("List Of Elements Are : = " + set);

		// Remove The Elements
		set.remove("Raj");

		System.out.println("After Removing : = " + set);

		// Iterate The Elements Using ForEach Loop
		for (Object array : set) {
			System.out.println("Iterate Elements Are : = " + array);
		}
	}
}

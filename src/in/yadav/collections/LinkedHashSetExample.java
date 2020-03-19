package in.yadav.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> list = new LinkedHashSet<>();
		//Adding The Elements
		list.add("Ritesh");
		list.add("Raj");
		list.add("Rajesh");
		
		System.out.println("List Of Elements Are : = "+ list);
		
		

		// Remove The Elements
		list.remove("Raj");

		System.out.println("After Removing : = " + list);

		// Iterate The Elements Using ForEach Loop
		for (String array : list) {
			System.out.println("Iterate Elements Are : = " + array);
		}
	}
}
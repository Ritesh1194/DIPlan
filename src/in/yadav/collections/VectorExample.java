package in.yadav.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector vector = new Vector();
		// Adding The Elements
		vector.add("Ritesh");
		vector.add("Raja");
		vector.add("Ravi");

		System.out.println("List Of Elements Are : = " + vector);
		
		//// Add All The Elements
		Vector vector1 = new Vector();
		vector1.add("Raj");
		vector1.add("Raju");
		vector1.addAll(1, vector);

		System.out.println("Add All Elements Are " + vector1);
	}

}

package in.yadav.programs;

/* 
 * Write a Java Program to iterate ArrayList using for-loop.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */
import java.util.ArrayList;

public class ArrayListUsingForLoop {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		int list1;

		list.add("Ritesh");
		list.add("Raj");
		list.add("Rupesh");
		list.add("Sudeep");

		for (list1 = 0; list1 < list.size(); list1++) {
			System.out.println("List Of Elements Are : =  " + list.get(list1));
		}
	}
}
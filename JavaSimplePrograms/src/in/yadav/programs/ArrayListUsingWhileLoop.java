package in.yadav.programs;

/* 
 * Write a Java Program to iterate ArrayList using  while-loop.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */
import java.util.ArrayList;

public class ArrayListUsingWhileLoop {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		int list1 = 0;

		list.add("Ritesh");
		list.add("Raj");
		list.add("Rajesh");
		list.add("Raju");

		while (list.size() > list1) {
			System.out.println("List Of Elements Are : =  " + list.get(list1));
			list1++;
		}
	}
}
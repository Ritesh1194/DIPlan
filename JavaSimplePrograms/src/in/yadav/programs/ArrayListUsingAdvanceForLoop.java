package in.yadav.programs;

/* 
 * Write a Java Program to iterate ArrayList using Advance-For-Loop.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */
import java.util.ArrayList;

public class ArrayListUsingAdvanceForLoop {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Ritesh");
		list.add("Raj");
		list.add("Krishna");
		list.add("Prem");

		for (String list1 : list) {
			System.out.println("List Of Elements Are : =  " + list1);
		}
	}
}
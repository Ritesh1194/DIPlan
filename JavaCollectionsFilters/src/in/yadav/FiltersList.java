package in.yadav;

/* 
 * 3.Creating a List of String by filtering.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  26-03-2020
 * */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("RITESH", "RAJA", "SUDEEP", "DURGA", "RUPESH");

		// Filters List Using Java 8 Features
		List<String> filteredList = list.stream().filter(entry -> entry.startsWith("R")).collect(Collectors.toList());

		System.out.println(filteredList);
	}
}
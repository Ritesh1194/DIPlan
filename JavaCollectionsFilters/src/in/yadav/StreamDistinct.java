package in.yadav;
/* 
 * Write a program for different operation Stream: StreamDistinct
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  27-03-2020
 * */
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("Ritesh", "Raja", "Raj", "Durga", "Ritesh", "Raja", "Sudeep");
		 
		// Get collection without duplicate Elements that's distinct only
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);
	}
}
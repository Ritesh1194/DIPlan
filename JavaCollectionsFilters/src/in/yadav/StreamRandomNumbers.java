package in.yadav;
/* 
 * Write a program for different operation Stream: Stream of Random Numbers()
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  27-03-2020
 * */
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamRandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();

		random.ints(5).sorted().forEach(System.out::println);

		// Five random doubles between 0 (inclusive) and 0.5 (exclusive)

		random.doubles(5, 0, 0.5).sorted().forEach(System.out::println);

		// Boxing long to Long so they can be collected
		List<Long> longs = random.longs(5).boxed().collect(Collectors.toList());
		System.out.println(longs);
	}
}
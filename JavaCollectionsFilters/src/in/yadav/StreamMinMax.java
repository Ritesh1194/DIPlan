package in.yadav;
/* 
 * Write a program for different operation Stream: Stream Max and Min()
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  27-03-2020
 * */
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMinMax {

	public static void main(String[] args) {
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();

		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
	}
}
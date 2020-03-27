package in.yadav;
/* 
 * Write a program for different operation Stream: Count Of Elements()
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  27-03-2020
 * */
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCountOfElements {

	public static void main(String[] args) {
		long count = Stream.of("com", "dot", "bridgelabz").count();
		System.out.printf("There are %d elements in the stream %n", count);

		count = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).count();
		System.out.printf("There are %d elements in the stream %n", count);

		count = LongStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(i -> i % 2 == 0).count();
		System.out.printf("There are %d elements in the stream %n", count);
	}
}
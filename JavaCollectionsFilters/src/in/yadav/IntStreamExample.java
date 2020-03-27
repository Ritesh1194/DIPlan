package in.yadav;
/* 
 * Write a program for different operation Stream: IntStream to Collection.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  27-03-2020
 * */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		List<Integer> ints = IntStream.of(1, 2, 3, 4, 5).mapToObj(Integer::valueOf).collect(Collectors.toList());

		System.out.println(ints);
	}
}
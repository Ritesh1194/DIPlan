package in.yadav;
/* 
 * Write a program for different operation Stream:InfiniteStream ()
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  27-03-2020
 * */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InfiniteStream {

	public static void main(String[] args) {
		List<Integer> ints = IntStream.iterate(0, i -> i + 2).mapToObj(Integer::valueOf).limit(10)
				.collect(Collectors.toList());

		System.out.println(ints);

	}
}
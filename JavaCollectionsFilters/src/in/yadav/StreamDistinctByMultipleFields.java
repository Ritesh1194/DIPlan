package in.yadav;
/* 
 * Write a program for different operation Stream: StreamDistinctByMultipleFields
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  27-03-2020
 * */
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDistinctByMultipleFields {

	public static void main(String[] args) {

		People a = new People(28, "Ritesh", "Ritesh");
		People b = new People(25, "Raju", "Raju");
		People c = new People(21, "Raju", "Raj");
		People d = new People(21, "Ritesh", "Ritesh");

		// A collection of duplicated elements
		Collection list = Arrays.asList(a, b, c, d);

		// Get distinct only
		Object distinctElements = list.stream().filter(distinctByKey(p -> ((People) p).getName()))
				.collect(Collectors.toList());

		// print the distinct result
		System.out.println(distinctElements);

		// Get distinct with multiple keys
		Object distinctMultiKeys = list.stream()
				.filter(distinctByKey(p -> ((People) p).getName() + ((People) p).getAge()))
				.collect(Collectors.toList());

		// print the distinct result
		System.out.println(distinctMultiKeys);
	}

	public static <T> Predicate distinctByKey(Function<? super T, Object> key) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(key.apply((T) t), Boolean.TRUE) == null;
	}
}
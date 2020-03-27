package in.yadav;
/* 
 * 1. Combine Predicate in Lambda Expressions in Java 8
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  26-03-2020
 * */
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PradicateExample {

	public static void main(String[] args) {
		List<Person> personList = Stream.of(new Person(1, "Ritesh", "463210", "MP"),
				new Person(24, "Rupesh", "465455", "Maharastra"), new Person(35, "Sudeep", "465242", "Odisha"))
				.collect(Collectors.toList());

		Predicate<Person> usOnly = (p) -> p.getCountryCode().equals("465242");
		Predicate<Person> stateCAOnly = (p) -> p.getState().equals("Odisha");

		// Display all persons from US (country code only)
		System.out.println(personList.stream().filter(usOnly).collect(Collectors.toList()));

		// Create a new predicate from the combination of usOnly and stateCAOnly
		Predicate<Person> usAndCa = usOnly.and(stateCAOnly);
		System.out.println(personList.stream().filter(usAndCa).collect(Collectors.toList()));

		// Original predicate not modified
		System.out.println(personList.stream().filter(usOnly).collect(Collectors.toList()));

		Predicate<Person> myOnly = (p) -> p.getCountryCode().equals("463210");
		Predicate<Person> legalAge = (p) -> p.getAge() >= 18;

		// List all persons from India
		System.out.println(personList.stream().filter(myOnly).collect(Collectors.toList()));

		Predicate<Person> malaysianLegalAge = myOnly.and(legalAge);

		// List all persons from India who are of legal age
		System.out.println(personList.stream().filter(malaysianLegalAge).collect(Collectors.toList()));
	}
}
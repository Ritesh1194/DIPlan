package in.yadav;
/* 
 * 1. Combine Predicate in Lambda Expressions in Java 8
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  26-03-2020
 * */
public class Person {
	private int age;
	private String name;
	private String countryCode;
	private String state;

	public Person(int age, String name, String countryCode, String state) {
		super();
		this.age = age;
		this.name = name;
		this.countryCode = countryCode;
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", countryCode=" + countryCode + ", state=" + state + "]";
	}
}

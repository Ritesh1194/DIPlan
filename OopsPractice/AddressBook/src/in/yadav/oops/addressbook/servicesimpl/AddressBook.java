package in.yadav.oops.addressbook.servicesimpl;

/******************************************************************************
 * 
 * 1. Purpose : Address Book Problem
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 29-03-2020
 *
 ******************************************************************************/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import in.yadav.oops.addressbook.model.Address;
import in.yadav.oops.addressbook.model.Person;
import in.yadav.oops.addressbook.service.AddressAbstract;
import in.yadav.oops.addressbook.utility.Oops;
import in.yadav.oops.addressbook.utility.Utility;

public class AddressBook extends AddressAbstract {

	/**
	 * listOfpersons is the list of persons in a address book and is declared
	 * private and static in order to main single copy of the list.
	 */
	private static List<Person> listOfPersons = new ArrayList<Person>();

	static JSONObject object1 = new JSONObject();

	public static JSONObject getJsonObject() {
		return object1;
	}

	/**
	 * Function to add a person in the specified address book
	 * 
	 * @throws IOException
	 */
	public void addPerson() throws IOException {
		Person person = new Person();

		System.out.println("Enter First Name : ");
		person.setFirstName(Utility.inputString());
		object1.put("firstName ", person.getFirstName());

		System.out.println("Enter Last Name : ");
		person.setLastName(Utility.inputString());
		object1.put("lastName ", person.getLastName());

		System.out.println("Enter Contact Number : ");
		person.setContactNo(Utility.inputLong());
		object1.put("Contact Number ", person.getContactNo());

		person.setAddress(addressDetails());

		Address address = person.getAddress();
		object1.put("Street ", address.getStreet());
		object1.put("City ", address.getCity());
		object1.put("State ", address.getState());
		object1.put("Zip Code ", address.getZipcode());

		listOfPersons.add(person);
		System.out.println(" Person Added Successfully ");
		Oops.writeFile1(object1, AddressBookManager.getBookName());
	}

	/**
	 * Function to set the address of the person to be added
	 * 
	 * @return address the address object
	 */
	public Address addressDetails() {
		Address address = new Address();

		System.out.println("Enter street : ");
		address.setStreet(Utility.inputString());

		System.out.println("Enter city : ");
		address.setCity(Utility.inputString());

		System.out.println("Enter state :");
		address.setState(Utility.inputString());

		System.out.println("Enter zipcode : ");
		address.setZipcode(Utility.inputLong());

		return address;
	}

	/**
	 * Function to edit the details of the specified perso buyOrSellStock(file);n in
	 * a particular address book
	 */
	public void editPerson() {
		System.out.println("Enter the details of the person whose information needs to be modified");
		System.out.println("Enter First Name : ");
		String firstName = Utility.inputString();

		System.out.println("Enter Last Name : ");
		String lastName = Utility.inputString();

		Optional<Person> optional = listOfPersons.parallelStream()
				.filter(person -> firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName()))
				.findAny();
		if (optional.isPresent())
			editUpdate(optional.get());
		else
			System.out.println("Person of that name is not present");
	}

	/**
	 * Function to edit the address of the person to be Updated
	 * 
	 * @param per
	 *            ->Person
	 * @return void
	 */
	public void editUpdate(Person per) {
		do {
			System.out.println("Enter the choice you want modify");

			System.out.println(" 1. Contact Number  2. Address");
			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				System.out.println("Enter the new contact number : ");
				long newContact = Utility.inputLong();
				per.setContactNo(newContact);
				System.out.println("Your contact number is updated ");
				break;
			case 2:
				Address address = per.getAddress();
				addressUpdate(address);
				per.setAddress(address);
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		} while (per != null);
	}

	/**
	 * Function to set the address of the person
	 * 
	 * @param address
	 *            the address that is obtained by the specified person
	 */
	public void addressUpdate(Address address) {
		do {
			System.out.println(" Enter the details of address you want to change ");
			System.out.println("1. Street  2. City  3. State  4. Zipcode");
			int ch = Utility.inputInteger();
			switch (ch) {
			case 1:
				System.out.println("Enter the Street ");
				String newStreet = Utility.inputString();
				address.setStreet(newStreet);
				System.out.println("Your Street is updated");
				break;
			case 2:
				System.out.println("Enter The City");
				String newCity = Utility.inputString();
				address.setCity(newCity);
				System.out.println("Your city is updated");
				break;
			case 3:
				System.out.println("Enter The State");
				String newState = Utility.inputString();
				address.setState(newState);
				System.out.println("Your state is updated");
				break;
			case 4:
				System.out.println("Enter The Zipcode");
				long newZip = Utility.inputLong();
				address.setZipcode(newZip);
				System.out.println("Your zip code has been updated ");
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		} while (address != null);
	}

	/**
	 * Function to display the list of persons in the particular address book
	 */
	public void display() {
		listOfPersons.forEach(person -> {
			System.out.println("First Name: " + person.getFirstName());
			System.out.println("Last Name: " + person.getLastName());
			System.out.println("Contact Number: " + person.getContactNo());

			Address add = person.getAddress();

			System.out.println("Street: " + add.getStreet());
			System.out.println("City: " + add.getCity());
			System.out.println("State: " + add.getState());
			System.out.println("Zip code: " + add.getZipcode());
			System.out.println("-------------------------------------");
		});
	}

	/**
	 * Function to delete the person in a specified address book
	 * 
	 * @throws IOException
	 */
	public void deletePerson() {
		JSONParser jsonParser = new JSONParser();
		System.out.println("Enter the details of person to delete");
		System.out.println("Enter First Name : ");
		String firstName = Utility.inputString();
		System.out.println("Enter Last Name  : ");
		String lastName = Utility.inputString();
		String filedata = null;
		try {
			filedata = Oops.readJsonFile(AddressBookManager.getBookName());
		} catch (IOException e) {
		}
		try {
			object1 = (JSONObject) jsonParser.parse(filedata);
		} catch (ParseException e) {
		}

		if (object1.containsValue(firstName) && object1.containsValue(lastName)) {
			object1.clear();
			System.out.println("Data Deleted Successfully");
		} else {
			System.out.println("Person not Found");
		}
		try {
			Oops.writeFile(object1.toString(), AddressBookManager.getBookName());
		} catch (IOException e) {
		}
	}

	/**
	 * Function to sort the persons in the specified address book by their last name
	 */
	public void sortByLastName() {
		Collections.sort(listOfPersons, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
	}

	/**
	 * Function to sort the persons in the specified address book by zip code
	 */
	public void sortByZipCode() {
		Collections.sort(listOfPersons,
				(person1, person2) -> person1.getAddress().getZipcode() > person2.getAddress().getZipcode() ? 1
						: person1.getAddress().getZipcode() < person2.getAddress().getZipcode() ? -1
								: person1.getAddress().getZipcode() == person2.getAddress().getZipcode() ? 0 : -10);
	}
}
package in.yadav.oops.addressbook.service;

import java.io.IOException;

import in.yadav.oops.addressbook.model.Address;
import in.yadav.oops.addressbook.model.Person;

public abstract class AddressAbstract {
	abstract public void addPerson() throws IOException;

	abstract public void editPerson();

	abstract public void editUpdate(Person per);

	abstract public void addressUpdate(Address address);

	abstract public void display();

	abstract public void deletePerson();

	abstract public void sortByLastName();

	abstract public void sortByZipCode();
}

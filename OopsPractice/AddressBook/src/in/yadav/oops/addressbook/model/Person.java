package in.yadav.oops.addressbook.model;

/******************************************************************************
 * 
 * 1. Purpose : Address Book Problem
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 29-03-2020
 *
 ******************************************************************************/
public class Person {
	private String firstName;
	private String lastName;
	private long contactNo;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", contactNo=" + contactNo + ", address="
				+ address + "]";
	}
}
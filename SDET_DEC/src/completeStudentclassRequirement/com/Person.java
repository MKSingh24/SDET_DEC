package completeStudentclassRequirement.com;

import com.studentmanagement.exception.InvalidAddressException;
import com.studentmanagement.exception.InvalidContactNumberException;

public abstract class Person {

	// make instance variable as protected to access in child class
	protected String name;
	protected int age;
	protected String address;
	protected String contactNumber;
	// introducing static variable
	private static int personCount = 0;

	public Person(String name, int age, String address, String contactNumber) {
		super();
		if (ValidateContactNumber(contactNumber) && validateAddress(address)) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.contactNumber = contactNumber;
			personCount++;
		}
	}

	// creating static method to fatch total person count

	public static int getTotalPersonCount() {
		return personCount;
	}

	// validation method

	private boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			System.err.println("Invalid teacher  age");
			return false;
		}
	}

	private boolean ValidateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			try {
				throw new InvalidContactNumberException("Contact number can not be NULL and more thrn 10 digit");// checked
																													// excep
			} catch (InvalidContactNumberException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;

		}
	}

	private boolean validateAddress(String address) {
		if (address.isEmpty() || address == null) {
			try {
				throw new InvalidAddressException("Address can not be empty ot null!!");// checked exception
			} catch (InvalidAddressException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;

		} else {

			return true;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (ValidateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	// Create method for update new address and contact number info of student and
	// teacher After
	// parent approval or hr approval
	// if need to update either Address or Contact details ,so we create same method
	// name with different parameter
	protected boolean updateInformation(String newAddress, String newContactNumber) {
		if (validateAddress(newAddress) && ValidateContactNumber(newContactNumber)) {
			this.address = newAddress;
			this.contactNumber = newContactNumber;
			System.out.println("Update address and contact info");
			return true;
		} else {
			return false;
		}
	}

	// Method overloading
	protected boolean updateInformation(String newAddress) {
		if (validateAddress(newAddress)) {
			this.address = newAddress;
			System.out.println("Update address information");
			return true;
		} else {
			return false;
		}
	}

	protected boolean updateInformation(String newContactNumber, boolean update) {
		if (ValidateContactNumber(newContactNumber)) {
			this.contactNumber = newContactNumber;
			System.out.println("Update contact info");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}

}

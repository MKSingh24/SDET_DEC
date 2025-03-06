package completeStudentclassRequirement.com;

import com.studentmanagement.exception.InvalidAgeException;
import com.studentmanagement.exception.InvalidEmpIdException;
import com.studentmanagement.exception.InvalidSubjectException;

public final class Teacher extends Person {

	private String empID;
	private String subject;
	private int yearOfExperience;
	private double salary;
	private static final double BASE_SALARY = 30000;// Constant-----final--static-----uppercase
	private static final double EXPERIENCE_BONUC = 2000;
	// Creating static variable teacherCount
	private static int teacherCount = 0;

	/*
	 * public Teacher(String name, int age, String contactNumber, String address,
	 * String empID, String subject, int yearOfExperience) {
	 * 
	 * if (validateAge(age) && ValidateContactNumber(contactNumber) &&
	 * validateAddress(address) && validateEmpId(empID) && validateSubject(subject)
	 * && validateYearOfExperience(yearOfExperience)) { this.name = name; this.age =
	 * age; this.contactNumber = contactNumber; this.address = address; this.empID =
	 * empID; this.subject = subject; this.yearOfExperience = yearOfExperience;
	 * calulateSalary(); } }
	 */

	public Teacher(String name, int age, String address, String contactNumber, String empID, String subject,
			int yearOfExperience) {
		super(name, age, address, contactNumber);

		if (validateAge(age) && ValidateContactNumber(contactNumber) && validateAddress(address) && validateEmpId(empID)
				&& validateSubject(subject) && validateYearOfExperience(yearOfExperience)) {
			this.empID = empID;
			this.subject = subject;
			this.yearOfExperience = yearOfExperience;
			teacherCount++;

			calulateSalary();
		}
	}

	// creating static method getTecherCount;

	public static int getTecherCount() {
		return teacherCount;
	}

	// validation method

	public boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			try {
				throw new InvalidAgeException(" teacher Age can not be less then 21 and gretter then 65 ");// checked
			} catch (InvalidAgeException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;

		}
	}

	public boolean ValidateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invlid contactNumber");
			return false;
		}
	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid Address");
			return false;
		}
	}

	public boolean validateEmpId(String empID) {
		if (empID.matches("T\\d{3}")) {
			return true;
		} else {

			throw new InvalidEmpIdException("Invalid empid");// run time

		}
	}

	public boolean validateSubject(String subject) {
		if (!subject.isEmpty()) {
			return true;
		} else {
			try {
				throw new InvalidSubjectException("Subject not be Empty");// checked
			} catch (InvalidSubjectException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}

			return false;
		}
	}

	public boolean validateYearOfExperience(int yearOfExperience) {
		if (yearOfExperience >= 0 && yearOfExperience <= 35) {
			return true;
		} else {
			System.err.println("invlid yearOfExperience");
			return false;
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
		if (validateAge(age)) {
			this.age = age;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getEmpID() {
		return empID;
	}

//	public void setEmpID(String empID) {
//		if (validateEmpId(empID)) {
//			this.empID = empID;
//		}
//	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject)) {
			this.subject = subject;
		}
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		if (validateYearOfExperience(yearOfExperience)) {
			this.yearOfExperience = yearOfExperience;
		}
	}

	public double getSalary() {
		return salary;
	}

	// calculate salary

	protected final void calulateSalary() {// restricted method overriding
		salary = BASE_SALARY + (yearOfExperience * EXPERIENCE_BONUC);
	}

	// To display teacher info
	public void displayTeacherInfo() {
		System.out.println("-----------------Teacher Information--------------------");

		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("ADDRESS: " + address);
		System.out.println("CONTACTNUMBER: " + contactNumber);
		System.out.println("EMPID: " + empID);
		System.out.println("SUBJECT: " + subject);
		System.out.println("YEAROFEXPERIENCE: " + yearOfExperience);
		System.out.println("SALARY: " + "&" + salary);

		System.out.println("=================================================");
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", empID=" + empID + ", subject=" + subject + ", yearOfExperience=" + yearOfExperience + ", salary="
				+ salary + "]";
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {
		// get HR Approval
		System.out.println("Requesting HR Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notify the teacher that information is updated ");
				return true;
			} else {
				return false;
			}
		}
		System.err.println("No Approval from Hr");
		return false;
	}

	// method overloading
	public boolean updateInformation(String newAddress) {
		// get HR Approval
		System.out.println("Requesting HR Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newAddress)) {
				System.out.println("Notify the teacher that information is updated ");
				return true;
			} else {
				return false;
			}
		}
		System.err.println("No Approval from Hr");
		return false;
	}

	public boolean updateInformation(String newContactNumber, boolean update) {
		// get HR Approval
		System.out.println("Requesting HR Approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newContactNumber, update)) {
				System.out.println("Notify the teacher that information is updated ");
				return true;
			} else {
				return false;
			}
		}
		System.err.println("No Approval from Hr");
		return false;
	}

	private boolean getHRApproval() {
		System.out.println(" HR Approvaed thr Request");
		return true;// dummey
	}

}

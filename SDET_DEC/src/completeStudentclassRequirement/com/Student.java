package completeStudentclassRequirement.com;

import java.util.Objects;

public abstract class Student extends Person {

	/*
	 * //we create parent class Person and intiliazed all common instance variable
	 * in student and teacher class - public String name; public int age; public
	 * String address; public String contactNumber;
	 */

	private final int rollNumber; // all instance variable marks as final ,we want object is immutable(so setter
									// method is not required)
	private final double marksobtainedInEnglish;
	private final double marksobtainedInMath;
	private final double marksobtainedInScience;
	// we will calculate all below field (no put hardcoded)
	protected final double totalMarks;
	protected double percentage;
	protected String grade;
	// creating static variable studentCount
	private static int studentCount = 0;

	// new requirement to add contact number and address field
	// 1-add instance variable,
	// update constructor,add getter and setter for new instance var
	// update toString method
	// do validation for address and contact number n both constructor and setter

	/*
	 * public Student(String name, int age, String address, String contactNumber,
	 * int rollNumber, double marksobtainedInEnglish, double marksobtainedInMath,
	 * double marksobtainedInScience) { if (validateAge(age) &&
	 * validateRollNumber(rollNumber) && validateMarks(marksobtainedInEnglish) &&
	 * validateMarks(marksobtainedInMath) && validateMarks(marksobtainedInScience)
	 * && validateAddress(address) && validateContactNumber(contactNumber)) {
	 * 
	 * this.name = name; this.age = age; this.address = address; this.contactNumber
	 * = contactNumber; this.rollNumber = rollNumber; this.marksobtainedInEnglish =
	 * marksobtainedInEnglish; this.marksobtainedInMath = marksobtainedInMath;
	 * this.marksobtainedInScience = marksobtainedInScience; //
	 * calculateTotalMarks();
	 * 
	 * } }
	 */

//	public Student(String name, int age, String address, String contactNumber, int rollNumber,
//			double marksobtainedInEnglish, double marksobtainedInMath, double marksobtainedInScience) {
//		super(name, age, address, contactNumber);
//		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksobtainedInEnglish)
//				&& validateMarks(marksobtainedInMath) && validateMarks(marksobtainedInScience)
//				&& validateAddress(address) && validateContactNumber(contactNumber)) {
//			this.rollNumber = rollNumber;
//			this.marksobtainedInEnglish = marksobtainedInEnglish;
//			this.marksobtainedInMath = marksobtainedInMath;
//			this.marksobtainedInScience = marksobtainedInScience;
//			studentCount++;
//			calculateTotalMarks();
//			calculatePercentage();
//			calculateGrade();

//
//		}
//	}

	protected Student(StudentBuilder studentBuilder) {
		super(studentBuilder.name, studentBuilder.age, studentBuilder.address, studentBuilder.contactNumber);
		this.rollNumber = studentBuilder.rollNumber;
		this.marksobtainedInEnglish = studentBuilder.marksobtainedInEnglish;
		this.marksobtainedInMath = studentBuilder.marksobtainedInMath;
		this.marksobtainedInScience = studentBuilder.marksobtainedInScience;
		totalMarks = calculateTotalMarks();
//		percentage = calculatePercentage(); remove and paste into chils class
//		grade = calculateGrade();
		studentCount++;

	}

	// getter and setter

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
		if (age >= 10 && age <= 21) {
			this.age = age;
		} else {
			System.out.println("Invalid age for student");
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

//	public void setRollNumber(int rollNumber) {
//		if (rollNumber > 1) {
//			this.rollNumber = rollNumber;
//		} else {
//			System.out.println("Invalid rollNumber for student");
//		}
//	}

	public double getMarksobtainedInEnglish() {
		return marksobtainedInEnglish;
	}

//	public void setMarksobtainedInEnglish(double marksobtainedInEnglish) {
//		if (marksobtainedInEnglish > 0 && marksobtainedInEnglish < 100) {
//			this.marksobtainedInEnglish = marksobtainedInEnglish;
//		} else {
//			System.out.println("invalid marks in english");
//		}
//	}

	public double getMarksobtainedInMath() {
		return marksobtainedInMath;
	}

//	public void setMarksobtainedInMath(double marksobtainedInMath) {
//		if (marksobtainedInMath > 0 && marksobtainedInMath < 100) {
//			this.marksobtainedInMath = marksobtainedInMath;
//		} else {
//			System.out.println("invalid marks in math");
//		}
//	}

	public double getMarksobtainedInScience() {
		return marksobtainedInScience;
	}

//	public void setMarksobtainedInScience(double marksobtainedInScience) {
//		if (marksobtainedInScience > 0 && marksobtainedInScience < 100) {
//			this.marksobtainedInScience = marksobtainedInScience;
//		} else {
//			System.out.println("invalid marks in Science");
//		}
//	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getGrade() {
		return grade;
	}

	// validation method -validation method put in side the Builder class
//	public boolean validateAge(int age) {
//		if (age >= 10 && age <= 21) {
//			return true;
//		} else {
//			System.err.println("Invalid age for student");
//			return false;
//		}

//	}

//	public boolean validateRollNumber(int rollNumber) {
//		if (rollNumber >= 1 && rollNumber <= 100) {
//			return true;
//		} else {
//			System.err.println("Invalid rollNumber for student");
//			return false;
//
//	}
//	}

	public boolean validateMarks(double marksForThesubject) {
		if (marksForThesubject >= 100 || marksForThesubject < 0) {
			System.err.println("Invalid Marks for student");
			return false;
		} else {
			return true;
		}
	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Address can not be empty");
			return false;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("invalid contact Number");
			return false;
		}
	}

	// method to calculate total mark,percentage,grade

	public final double calculateTotalMarks() {
		double totalMarks = marksobtainedInEnglish + marksobtainedInMath + marksobtainedInScience;
		return totalMarks;

		// System.out.println("Total mark obtained" + totalMarks);
	}

	public abstract double calculatePercentage(); // making a abstract method to override bu child class
//	{
//		double percentage = totalMarks / 3;
//		return percentage;
//	}

	public final String calculateGrade() {
		String grade;
		if (percentage == 0) {
			grade = "percentage can not be calculated";
		} else {

			grade = GradePolicy.calculateGrade(percentage);

//			  if (percentage >= 95) {
//				 grade = "A+"; 
//				 } else if (percentage >= 90) {
			// grade = "A";
			// } else if (percentage >= 85) {
//                	   grade = "B+"; 
//                	   } else if (percentage >= 80) { 
//                		   grade = "B";
			// } else if (percentage >= 75) {
			// grade = "C+";
			// } else if(percentage >= 70) {
			// grade = "C";
			// } else if (percentage >= 60) {
			// grade = "D";

//			                             } else { grade = "F"; }

		}

		return grade;
	}

	public void displayStudentInfo() {
		System.out.println("----------Student Information-----------");
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("ADDRESS: " + address);
		System.out.println("CONTACTNUMBER: " + contactNumber);
		System.out.println("ROLLNUMBER: " + rollNumber);
		System.out.println("ENGLISHMARK: " + marksobtainedInEnglish);
		System.out.println("MATHMARK: " + marksobtainedInMath);
		System.out.println("SCIENCEMARK: " + marksobtainedInScience);
		System.out.println("***************************************");
		System.out.println("TOTALMARKS: " + totalMarks);
		System.out.println("PERCENTAGE: " + percentage + "%");
		System.out.println("GRADE: " + grade);
		System.out.println("=================================");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", rollNumber=" + rollNumber + ", marksobtainedInEnglish=" + marksobtainedInEnglish
				+ ", marksobtainedInMath=" + marksobtainedInMath + ", marksobtainedInScience=" + marksobtainedInScience
				+ ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksobtainedInEnglish, marksobtainedInMath, marksobtainedInScience, name,
				percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksobtainedInEnglish) == Double
						.doubleToLongBits(other.marksobtainedInEnglish)
				&& Double.doubleToLongBits(marksobtainedInMath) == Double.doubleToLongBits(other.marksobtainedInMath)
				&& Double.doubleToLongBits(marksobtainedInScience) == Double
						.doubleToLongBits(other.marksobtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}
	// Create method for update new address and contact number info of student After
	// parent approval

	// if need to update either Address or Contact details ,so we create same method
	// name with different parameter

	public boolean updateInformation(String newAddress, String newContactNumber) {

		// parent approval
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {
			// then upadte Person.address with newAddress and with Person.contactNumber with
			// newContactnumber
			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notify the Parent.........");
				return true;
			} else {
				System.err.println("No Approval from parent");
				return false;
			}
		}
		return false;

	}

	// Method overloading
	public boolean updateInformation(String newAddress) {

		// parent approval
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {
			// then update Person.address with newAddress
			if (super.updateInformation(newAddress)) {
				System.out.println("Notify the Parent.........");
				return true;
			} else {
				System.err.println("No Approval from parent");
				return false;
			}
		}
		return false;

	}

	public boolean updateInformation(String newContactNumber, boolean update) {

		// parent approval
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {
			// then upadte Person.contactNumber with
			// newContactnumber
			if (super.updateInformation(newContactNumber, update)) {
				System.out.println("Notify the Parent.........");
				return true;
			} else {
				System.err.println("No Approval from parent");
				return false;
			}
		}
		return false;

	}

	private boolean parentApproval() {

		return true;// dummy
	}

	// Crating static method to get total student count

	public static int getStudentCount() {
		return studentCount;
	}

	// creating inner class(static)

	public abstract static class StudentBuilder {

		// Mandatory
		private String name;
		private int age;
		private String address;
		private String contactNumber;

		// Optional
		private int rollNumber;
		private double marksobtainedInEnglish;
		private double marksobtainedInMath;
		private double marksobtainedInScience;

		public StudentBuilder(String name, int age, String address, String contactNumber) {
			if (validateAge(age) && validateAddress(address) && validateContactNumber(contactNumber)) {
				this.name = name;
				this.age = age;
				this.address = address;
				this.contactNumber = contactNumber;
			}
		}

		public StudentBuilder withRollnumber(int rollNumber) {
			if (validateRollNumber(rollNumber)) {
				this.rollNumber = rollNumber;
			}
			return this;

		}

		public StudentBuilder withmarksObtainedInEnglish(double marksobtainedInEnglish) {
			if (validateMarks(marksobtainedInEnglish)) {
				this.marksobtainedInEnglish = marksobtainedInEnglish;
			}
			return this;
		}

		public StudentBuilder withmarksObtainedInMath(double marksobtainedInMath) {
			if (validateMarks(marksobtainedInMath)) {
				this.marksobtainedInMath = marksobtainedInMath;
			}
			return this;
		}

		public StudentBuilder withmarksObtainedInScience(double marksobtainedInScience) {
			if (validateMarks(marksobtainedInScience)) {
				this.marksobtainedInScience = marksobtainedInScience;
			}
			return this;
		}

		public abstract Student build();
		// {

		// Student s = new Student(name, age, address, contactNumber, rollNumber,
		// marksobtainedInEnglish,
		// marksobtainedInMath, marksobtainedInScience);
		// Student s = new Student(this); //now student class is parent class so we can
		// not create object of parent class
		// so we convert build method into abstract and override build method in child
		// class
		// return s;
		// }

		// validation method
		private boolean validateAge(int age) {
			if (age >= 10 && age <= 21) {
				return true;
			} else {
				System.err.println("Invalid age for student");
				return false;
			}

		}

		private boolean validateAddress(String address) {
			if (!address.isEmpty()) {
				return true;
			} else {
				System.err.println("Address can not be empty");
				return false;
			}
		}

		private boolean validateContactNumber(String contactNumber) {
			if (contactNumber != null && contactNumber.matches("\\d{10}")) {
				return true;
			} else {
				System.err.println("invalid contact Number");
				return false;
			}
		}

		private boolean validateRollNumber(int rollNumber) {
			if (rollNumber >= 1 && rollNumber <= 100) {
				return true;
			} else {
				System.err.println("Invalid rollNumber for student");
				return false;

			}
		}

		private boolean validateMarks(double marksForThesubject) {
			if (marksForThesubject >= 100 || marksForThesubject < 0) {
				System.err.println("Invalid Marks for student");
				return false;
			} else {
				return true;
			}
		}

	}

}

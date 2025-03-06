package completeStudentclassRequirement.com;

import com.studentmanagement.exception.InvalidAddressException;
import com.studentmanagement.exception.InvalidAgeException;
import com.studentmanagement.exception.InvalidMarksException;

public class Student2 extends Person {

	private final int rollNumber;
	private final double marksobtainedInEnglish;
	private final double marksobtainedInMath;
	private final double marksobtainedInScience;
	// we will calculate all below field (no put hardcoded)
	private final double totalMarks;
	private final double percentage;
	private final String grade;
	// creating static variable studentCount
	private static int studentCount = 0;

	private Student2(StudentBuilder2 studentBuilder) {
		super(studentBuilder.name, studentBuilder.age, studentBuilder.address, studentBuilder.contactNumber);
		this.rollNumber = studentBuilder.rollNumber;
		this.marksobtainedInEnglish = studentBuilder.marksobtainedInEnglish;
		this.marksobtainedInMath = studentBuilder.marksobtainedInMath;
		this.marksobtainedInScience = studentBuilder.marksobtainedInScience;
		totalMarks = calulateTotalMarks();
		percentage = calculatePercentage();
		grade = calculateGrade();
		studentCount++;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public double getMarksobtainedInEnglish() {
		return marksobtainedInEnglish;
	}

	public double getMarksobtainedInMath() {
		return marksobtainedInMath;
	}

	public double getMarksobtainedInScience() {
		return marksobtainedInScience;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student2 [rollNumber=" + rollNumber + ", marksobtainedInEnglish=" + marksobtainedInEnglish
				+ ", marksobtainedInMath=" + marksobtainedInMath + ", marksobtainedInScience=" + marksobtainedInScience
				+ ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", grade=" + grade + "]";
	}

	// mathod for calulate totalmatks,percentage and grade
	public double calulateTotalMarks() {
		double totalMarks = marksobtainedInEnglish + marksobtainedInMath + marksobtainedInScience;
		return totalMarks;
	}

	public double calculatePercentage() {
		double percentage = totalMarks / 3;
		return percentage;
	}

	public String calculateGrade() {
		String grade;
		if (percentage == 0) {
			grade = "Grade can not be calculated";
		} else {
			grade = GradePolicy.calculateGrade(percentage);
		}
		return grade;
	}

	// display info
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

	;

	// Bulder class
	public static class StudentBuilder2 {
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

		public StudentBuilder2(String name, int age, String address, String contactNumber) {
			if (validateAge(age) && validateAddress(address) && validateContactNumber(contactNumber)) {
				this.name = name;
				this.age = age;
				this.address = address;
				this.contactNumber = contactNumber;
			}
		}

		public StudentBuilder2 withRollnumber(int rollNumber) {
			if (validateRollNumber(rollNumber)) {
				this.rollNumber = rollNumber;
			}
			return this;
		}

		public StudentBuilder2 withmarksObtainedInEnglish(double marksobtainedInEnglish) {
			if (validateMarks(marksobtainedInEnglish)) {
				this.marksobtainedInEnglish = marksobtainedInEnglish;
			}
			return this;
		}

		public StudentBuilder2 withmarksObtainedInMath(double marksobtainedInMath) {
			if (validateMarks(marksobtainedInMath)) {
				this.marksobtainedInMath = marksobtainedInMath;
			}
			return this;
		}

		public StudentBuilder2 withmarksObtainedInScience(double marksobtainedInScience) {
			if (validateMarks(marksobtainedInScience)) {
				this.marksobtainedInScience = marksobtainedInScience;
			}
			return this;
		}

		public Student2 build() {
			Student2 s = new Student2(this);
			return s;

		}

		// Validation method

		public boolean validateAge(int age) {
			if (age >= 10 && age <= 21) {
				return true;
			} else {
				try {
					throw new InvalidAgeException("Student age can not be less then 10 and gretter then 21");// checked
				} catch (InvalidAgeException e) {
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

		public boolean validateContactNumber(String contactNumber) {
			if (contactNumber != null && contactNumber.matches("\\d{10}")) {
				return true;
			} else {
				System.err.println("invalid contact Number");
				return false;
			}
		}

		public boolean validateRollNumber(int rollNumber) {
			if (rollNumber >= 1 && rollNumber <= 100) {
				return true;
			} else {
				System.err.println("Invalid rollNumber for student");
				return false;

			}
		}

		public boolean validateMarks(double marksForThesubject) {
			if (marksForThesubject >= 100 || marksForThesubject < 0) {
				throw new InvalidMarksException("Marks can not be gretter then 100 and less then 0");
			} else {
				return true;
			}
		}

	}

}

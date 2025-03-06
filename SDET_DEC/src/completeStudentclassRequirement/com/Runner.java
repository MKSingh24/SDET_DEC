package completeStudentclassRequirement.com;

public class Runner {

	public static void main(String[] args) {

		// when we create reference variable of parent and object of child class call
		// polymorphism ,up casting

		Person s1 = new Student("mukesh", 21, "Uk London", "2345678903", 5, 80, 70, 54);

		// s1.calculateTotalMarks();
		// s1.calculatePercentage();
		// s1.calculateGrade();
		// System.out.println(s1);
		((Student) s1).displayStudentInfo(); // down casting
		s1.updateInformation("NewYork", "9090909090");// java override the method by calling the updateInformation()
														// method of child
		s1.updateInformation("USA");
		s1.updateInformation("7777777777", true);

		((Student) s1).displayStudentInfo();

		Person s2 = new Student("Rakesg", 20, "Uk USA", "5345678903", 4, 89, 79, 50);
		((Student) s2).displayStudentInfo();

		Person t1 = new Teacher("Banti", 25, "Gaya", "7890098778", "T101", "JAVA", 4);
		((Teacher) t1).displayTeacherInfo();
		t1.updateInformation("naibazar Gaya", "7890790781");
		t1.updateInformation("0909090909", true);
		((Teacher) t1).displayTeacherInfo();

		Person t2 = new Teacher("Rahul", 29, "MUMbai", "8880098778", "T102", "Math", 3);
		((Teacher) t2).displayTeacherInfo();
		// Total person count
		System.out.println("Total Person joined In School :" + Person.getTotalPersonCount());
		// Total student count

		System.out.println("Total student joined In School :" + Student.getStudentCount());

		// Total Techer joined

		System.out.println("Total Techer joined In School :" + Teacher.getTecherCount());
	}

}

package completeStudentclassRequirement.com;

public class Runner2 {

	public static void main(String[] args) {

		Student s1 = new Student.StudentBuilder("Mukesh Kumar", 19, "Ghaziyzvad", "9090909090").withRollnumber(4)
				.withmarksObtainedInEnglish(90).withmarksObtainedInMath(80).withmarksObtainedInScience(85).build();
		System.out.println(s1);
		s1.displayStudentInfo();

		Person t2 = new Teacher("Rahul", 29, "MUMbai", "8880098778", "T102", "Math", 3);
		((Teacher) t2).displayTeacherInfo();

		Student2 s2 = new Student2.StudentBuilder2("Singh", 18, "Vashundhra", "8070007099")
				.withmarksObtainedInEnglish(90).withmarksObtainedInMath(90).withmarksObtainedInScience(86)
				.withRollnumber(5).build();

		System.out.println(s2);
		s2.displayStudentInfo();

		// Total person count
		System.out.println("Total Person joined In School :" + Person.getTotalPersonCount());
		// Total student count

		System.out.println("Total student joined In School :" + Student.getStudentCount());

		// Total Techer joined

		System.out.println("Total Techer joined In School :" + Teacher.getTecherCount());

	}

}

package completeStudentclassRequirement.com;

public class Runner3 {

	public static void main(String[] args) {

		Student s1 = new RegularStudent.RegularStudentBuilder("Rakesg", 20, "New Delhi", "0909090909")
				.withmarksObtainedInEnglish(90).withRollnumber(8).withmarksObtainedInMath(80)
				.withmarksObtainedInScience(70).build();

		System.out.println(s1);
		s1.displayStudentInfo();

		Student s2 = new SportStudent.SportsStudentBuilder("Abhi", 17, "Ghaziabad", "9876543210").withSportsScore(40)
				.withRollnumber(9).withmarksObtainedInEnglish(90).withmarksObtainedInMath(95)
				.withmarksObtainedInScience(90).build();

		System.out.println(s2);
		s2.displayStudentInfo();
	}

}

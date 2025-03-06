package completeStudentclassRequirement.com;

public final class GradePolicy {

	public static final int A_PULSE;
	public static final int A_GRADE;
	public static final int B_PULSE;
	public static final int B_GRADE;
	public static final int C_PULSE;
	public static final int C_GRADE;
	public static final int D_PULSE;
	public static final int D_GRADE;
	public static final int PASSING_MARKS;

	private GradePolicy() {

	}

	static {
		System.out.println("Grade Policy loaded in  the System");

		A_PULSE = 95;
		A_GRADE = 90;
		B_PULSE = 85;
		B_GRADE = 80;
		C_PULSE = 75;
		C_GRADE = 70;
		D_PULSE = 65;
		D_GRADE = 60;
		PASSING_MARKS = 33;

	}

	public static String calculateGrade(double percentage) {

		if (percentage >= A_PULSE) {
			return "A+";
		} else if (percentage >= A_GRADE) {
			return "A";
		} else if (percentage >= B_PULSE) {
			return "B+";
		} else if (percentage >= B_GRADE) {
			return "B";
		} else if (percentage >= C_PULSE) {
			return "C+";
		} else if (percentage >= C_GRADE) {
			return "C";
		} else if (percentage >= D_PULSE) {
			return "D+";
		} else if (percentage >= D_GRADE) {
			return "D";
		} else {
			return "F";
		}

	}

}

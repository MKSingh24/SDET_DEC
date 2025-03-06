package completeStudentclassRequirement.com;

public class SportStudent extends Student {

	private double sportsScore;

	private SportStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		this.sportsScore = ((SportsStudentBuilder) studentBuilder).sportsScore; // DownCasting
		percentage = calculatePercentage();
		grade = calculateGrade();

	}

	@Override
	public double calculatePercentage() {

		System.out.println("TotalMarks :" + getTotalMarks());
		System.out.println("SPORTS SCORE :" + sportsScore);

		double acdemicPercentage = getTotalMarks() / 3.0;
		double finalPercentage = (acdemicPercentage * 0.8) + (sportsScore * 0.2);
		return finalPercentage;

	}

	@Override
	public String toString() {
		return "SportStudent [sportsScore=" + sportsScore + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getAddress()=" + getAddress() + ", getContactNumber()=" + getContactNumber() + ", getRollNumber()="
				+ getRollNumber() + ", getMarksobtainedInEnglish()=" + getMarksobtainedInEnglish()
				+ ", getMarksobtainedInMath()=" + getMarksobtainedInMath() + ", getMarksobtainedInScience()="
				+ getMarksobtainedInScience() + ", getTotalMarks()=" + getTotalMarks() + ", getPercentage()="
				+ getPercentage() + ", getGrade()=" + getGrade() + "]";
	}

	public static class SportsStudentBuilder extends StudentBuilder {
		private double sportsScore;

		public SportsStudentBuilder(String name, int age, String address, String contactNumber) {
			super(name, age, address, contactNumber);
			// TODO Auto-generated constructor stub
		}

		public SportsStudentBuilder withSportsScore(double sportsScore) {
			if (sportsScore > 0 && sportsScore <= 100) {
				this.sportsScore = sportsScore;
			}
			return this;
		}

		@Override
		public Student build() {
			Student s = new SportStudent(this);
			return s;
		}

	}

}

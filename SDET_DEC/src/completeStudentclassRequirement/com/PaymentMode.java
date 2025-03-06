package completeStudentclassRequirement.com;

public enum PaymentMode implements DemoInterface {

	CASH("Payment via Cash") {
		@Override
		public void test() {
			System.out.println("Payment is done by cash(abstract method)");

		}
	},
	UPI("payney via UPI ") {
		@Override
		public void test() {
			// TODO Auto-generated method st ub

		}
	},
	CARD("Payment via CARD") {
		@Override
		public void test() {
			// TODO Auto-generated method stub

		}
	};

	private String Description;

	private PaymentMode(String description) {
		Description = description;
	}

	public String getDescription() {
		return Description;
	}

	@Override
	public void demo() {
		System.out.println("we saw enum implemnts interface");

	}

	public abstract void test();

}

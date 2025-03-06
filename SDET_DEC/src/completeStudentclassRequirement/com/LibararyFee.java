package completeStudentclassRequirement.com;

public class LibararyFee implements Payable {

	private double basicSubscription;
	private double additionalBookCharge;
	private double returnLatePenalty;
	private double finalLibraryFee;

	public LibararyFee(double basicSubscription, double additionalBookCharge, double returnLatePenalty) {
		super();
		this.basicSubscription = basicSubscription;
		this.additionalBookCharge = additionalBookCharge;
		this.returnLatePenalty = returnLatePenalty;
	}

	@Override
	public double calculatePayment() {
		finalLibraryFee = basicSubscription + additionalBookCharge + returnLatePenalty;
		return returnLatePenalty;
	}

	public boolean processPayment(String paymentMode) {
		if (paymentMode.equalsIgnoreCase("BITCON")) {
			System.out.println("Connect intto the Wallet and!!! Transfer 000000.1 BITCON");
			System.out.println(" Payments Successful");
			return true;
		} else {
			System.err.println("Somtihing went wrong");
			return false;
		}
	}

	@Override
	public void generateReciept() {
		System.out.println("************Generating Fee Reciept**********");
		System.out.println("Basic Subscription :" + basicSubscription);
		System.out.println("Additional BookCharge:" + additionalBookCharge);
		System.out.println("ReturnLate Penalty :" + returnLatePenalty);
		System.out.println("finalLibraryFee Fee :" + finalLibraryFee);

	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}

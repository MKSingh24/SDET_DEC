package completeStudentclassRequirement.com;

public class TuitionFees implements Payable {

	private final double baseFees;
	private final double scholershipDeduction;
	private final double earlyPaymentDiscount;
	private double finalFeeAmount;

	public TuitionFees(double baseFees, double scholershipDeduction, double earlyPaymentDiscount) {
		super();
		this.baseFees = baseFees;
		this.scholershipDeduction = scholershipDeduction;
		this.earlyPaymentDiscount = earlyPaymentDiscount;
	}

	@Override
	public double calculatePayment() {
		finalFeeAmount = baseFees - scholershipDeduction - earlyPaymentDiscount;
		return finalFeeAmount;
	}

	// so we implement processPayment method(complete method )in Payable
	// interface,so no need to implement in child class
//	public boolean processPayment(String paymentMode) {
//		if (paymentMode.equalsIgnoreCase("CASH") || paymentMode.equalsIgnoreCase("CARD")
//				|| paymentMode.equalsIgnoreCase("UPI")) {
//			System.out.println("Processing Payments");
//			System.out.println(" Payments Successful");
//			return true;
//		} else {
//			System.err.println("Somtihing went wrong");
//			return false;
//		}
//
//	}

	@Override
	public void generateReciept() {
		System.out.println("************Generating Fee Reciept**********");
		System.out.println("BASE FEE :" + baseFees);
		System.out.println("SCHOLARSHIP :-" + scholershipDeduction);
		System.out.println("EARLY DECOUNT :-" + earlyPaymentDiscount);
		System.out.println("Total FEE PAID :" + finalFeeAmount);

		System.out.println("@@@@@@@@@@@@@@@THANK YOU@@@@@@@@@@@@@@@@@@@@@");

	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return (scholershipDeduction + earlyPaymentDiscount);
	}

}

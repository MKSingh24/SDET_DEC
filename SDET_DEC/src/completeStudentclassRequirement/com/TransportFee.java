package completeStudentclassRequirement.com;

public class TransportFee implements Payable {

	private double baseFee;
	private int paymentMonth;
	private double siblingDiscount;

	private double finalTransportFee;

	public TransportFee(double baseFee, int paymentMonth, double siblingDiscount) {
		super();
		this.baseFee = baseFee;
		this.paymentMonth = paymentMonth;
		this.siblingDiscount = siblingDiscount;
	}

	@Override
	public double calculatePayment() {

		finalTransportFee = (baseFee * paymentMonth) - siblingDiscount;

		return finalTransportFee;
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
//	}

	@Override
	public void generateReciept() {
		System.out.println("************Generating Fee Reciept**********");
		System.out.println("BASE FEE :" + baseFee);
		System.out.println("PAYMENT MONTH:" + paymentMonth);
		System.out.println("Sibling Discount :" + siblingDiscount);
		System.out.println("FinalTransport Fee :" + finalTransportFee);

	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return siblingDiscount;
	}

}

package completeStudentclassRequirement.com;

public interface Payable {

	// Interface is always going to have variable as constant!!

	public abstract double calculatePayment();

	// to remove the code duplicates code in all fee class ,we convert
	// processPayment abstract method to default method
	// (java 8 or above allow u can implement complete method in interface

//	public default boolean processPayment(String paymentMode) {
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

	public default boolean processPayment(PaymentMode paymentMode) {
		if (paymentMode == PaymentMode.CARD || paymentMode == PaymentMode.CASH || paymentMode == PaymentMode.UPI) {
			System.out.println("Processing Payments");
			System.out.println(" Payments Successful with :" + paymentMode);
			return true;
		} else {
			System.err.println("Somtihing went wrong");
			return false;
		}
	}

	public abstract void generateReciept();

	public abstract double getDiscount();
}

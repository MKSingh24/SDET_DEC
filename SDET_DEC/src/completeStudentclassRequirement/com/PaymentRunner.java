package completeStudentclassRequirement.com;

public class PaymentRunner {

	public static void main(String[] args) {

		Payable tuitionFees = new TuitionFees(50000, 10000, 5000);
		tuitionFees.calculatePayment();
		// tuitionFees.processPayment("UPI");
		tuitionFees.processPayment(PaymentMode.CARD);
		tuitionFees.generateReciept();
		System.out.println(tuitionFees.getDiscount());
		System.out.println(PaymentMode.CARD);
		System.out.println(PaymentMode.CARD.getDescription());

		int index = PaymentMode.CARD.ordinal();// give me index of value
		System.out.println(index);

		// convert string to enum
		PaymentMode p = PaymentMode.valueOf("UPI");

		System.out.println(p);

		PaymentMode modes[] = PaymentMode.values();

		for (PaymentMode mode : modes) {

			System.out.println(mode);

		}

		PaymentMode.CARD.demo();// interface method
		PaymentMode.CARD.test();// abstract method

		System.out.println("!!!!!!!!!!!!Sports FEE!!!!!!!!!!!!!");

		Payable sportsFee = new SpportFee(40000, 20000, 10000, 5000);
		sportsFee.calculatePayment();
		sportsFee.processPayment(PaymentMode.CASH);
		sportsFee.generateReciept();
		System.out.println(sportsFee.getDiscount());

		System.out.println("!!!!!!!!!!!!Transport FEE!!!!!!!!!!!!!");

		Payable transportFee = new TransportFee(2000, 5, 1000);
		transportFee.calculatePayment();
		transportFee.processPayment(PaymentMode.UPI);
		transportFee.generateReciept();
		System.out.println(transportFee.getDiscount());

		System.out.println("!!!!!!!!!!!!Libarary FEE!!!!!!!!!!!!!");

//		Payable libararyFee = new LibararyFee(1500, 500, 100);
//		libararyFee.calculatePayment();
//		libararyFee.processPayment("BITCON");
//		libararyFee.generateReciept();
//		System.out.println(libararyFee.getDiscount());
	}

}

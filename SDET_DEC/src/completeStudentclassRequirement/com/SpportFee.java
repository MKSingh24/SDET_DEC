package completeStudentclassRequirement.com;

public class SpportFee implements Payable {

	private double equipmentCharg;
	private double tournamentFees;
	private double teamUniformCost;
	private double discountForStatePlayer;
	private double FinalsportsFees;

	public SpportFee(double equipmentCharg, double tournamentFees, double teamUniformCost,
			double discountForStatePlayer) {
		super();
		this.equipmentCharg = equipmentCharg;
		this.tournamentFees = tournamentFees;
		this.teamUniformCost = teamUniformCost;
		this.discountForStatePlayer = discountForStatePlayer;
	}

	@Override
	public double calculatePayment() {
		FinalsportsFees = equipmentCharg + tournamentFees + teamUniformCost - discountForStatePlayer;
		return FinalsportsFees;
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
		System.out.println("Equipment Charg :" + equipmentCharg);
		System.out.println("Tournament Fee :" + tournamentFees);
		System.out.println("TeamUniform Cost :" + teamUniformCost);
		System.out.println("Discount For StatePlayer :-" + discountForStatePlayer);
		System.out.println("Total FinalsportsFees :" + FinalsportsFees);

		System.out.println("@@@@@@@@@@@@@@@THANK YOU@@@@@@@@@@@@@@@@@@@@@");

	}

	@Override
	public double getDiscount() {

		return discountForStatePlayer;
	}

}

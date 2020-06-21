package Elements;

public class AutomatedExitPanel {
	Cashier cashierClass = null;

	public AutomatedExitPanel() {
		cashierClass = new Cashier();
	}

	public void payParkingFee(long payment, String paymentType, ParkingTicket parkingTicket) {
		cashierClass.payParkingFee(payment, paymentType, parkingTicket);
	}
}

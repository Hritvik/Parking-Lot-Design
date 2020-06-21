package Elements;

public class CustomerInfoPortal {
	Cashier cashierClass = null;

	public void payParkingFee(long payment, String paymentType, ParkingTicket parkingTicket) {
		cashierClass.payParkingFee(payment, paymentType, parkingTicket);
	}
}

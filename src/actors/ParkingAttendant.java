package actors;

import Elements.Cashier;
import Elements.ParkingTicket;

public class ParkingAttendant {
	Cashier cashierClass = null;

	public ParkingAttendant() {
		cashierClass = new Cashier();
	}
	public void payParkingFee(long payment, String paymentType, ParkingTicket parkingTicket) {
		cashierClass.payParkingFee(payment, paymentType, parkingTicket);
	}
}

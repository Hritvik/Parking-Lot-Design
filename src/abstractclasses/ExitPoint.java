package abstractclasses;

import Elements.AutomatedExitPanel;
import Elements.ParkingTicket;
import actors.ParkingAttendant;

public class ExitPoint {
	ParkingAttendant parkingAttendant = null;
	AutomatedExitPanel automatedExitPanel = null;

	public ExitPoint(ParkingAttendant parkingAttendant, AutomatedExitPanel automatedExitPanel) {
		this.parkingAttendant = parkingAttendant;
		this.automatedExitPanel = automatedExitPanel;
	}

	public void payParkingFee(long payment, String paymentType, String via, ParkingTicket parkingTicket) {
		if (via.equals("ParkingAttendant")) {
			parkingAttendant.payParkingFee(payment, paymentType, parkingTicket);
		} else if (via.equals("automatedExitPanel")) {
			automatedExitPanel.payParkingFee(payment, paymentType, parkingTicket);
		}

	}
}

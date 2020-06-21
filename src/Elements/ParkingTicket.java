package Elements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkingTicket {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	private String entryTime;
	private String paymentStatus;

	public ParkingTicket() {
		entryTime = sdf.format(new Date());
		paymentStatus = "Pending";
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}
}

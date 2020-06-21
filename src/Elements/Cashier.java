package Elements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cashier {
	static double firstRate = 4;
	static double secondRate = 3.5;
	static double thirdRate = 2.5;

	public boolean payParkingFee(long payment, String paymentType, ParkingTicket parkingTicket) {
		try {
			double fee = 0;
			if ((paymentType.equals("Cash") || paymentType.equals("Credit Card"))) {
				fee = scanParkingFee(parkingTicket);
				if (payment > fee) {
					parkingTicket.setPaymentStatus("Successful");
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public double scanParkingFee(ParkingTicket parkingTicket) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		double fee = 0;
		try {
			String entryTime = parkingTicket.getEntryTime();
			Date entryTimeObj = sdf.parse(entryTime);
			Date now = new Date();
			long diff = now.getTime() - entryTimeObj.getTime();
			int parkingHours = (int) diff / 3600000;

			if (parkingHours > 0) {
				fee += firstRate;
				parkingHours -= 1;
			}
			if (parkingHours > 0) {
				fee += Math.min(parkingHours, 2) * secondRate;
				parkingHours -= Math.min(parkingHours, 2);
			}
			if (parkingHours > 0) {
				fee += parkingHours * thirdRate;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return fee;
	}

	public ParkingTicket collectParkingTicket() {
		return new ParkingTicket();
	}
}

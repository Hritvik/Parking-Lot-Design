package Elements;

public class EntryPoint {
	Cashier cashierClass = null;

	public EntryPoint() {
		 cashierClass= new Cashier();
	}

	public void collectParkingTicket() {
		cashierClass.collectParkingTicket();
	}
}

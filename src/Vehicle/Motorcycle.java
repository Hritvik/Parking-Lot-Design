package Vehicle;

import java.util.ArrayList;

import Elements.ParkingTicket;
import abstractclasses.Vehicle;

public class Motorcycle extends Vehicle {
	ArrayList<ParkingTicket> pocket = null;
	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}

}

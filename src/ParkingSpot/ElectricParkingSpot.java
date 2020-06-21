package ParkingSpot;

import Elements.ElectricPanel;
import abstractclasses.ParkingSpot;

public class ElectricParkingSpot extends ParkingSpot {
	ElectricPanel electricPanel = new ElectricPanel();

	private boolean occupied = false;

	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}

	@Override
	public boolean isOccupied() {
		return occupied;
	}

	@Override
	public void occupySpot() {
		occupied = true;
	}

	@Override
	public void freeSpot() {
		occupied = false;
	}

}

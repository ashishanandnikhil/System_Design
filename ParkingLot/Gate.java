package ParkingLot;

public class Gate {

	private int gateNumber;

	public Gate(int gateNumber) {
		super();
		this.gateNumber = gateNumber;
	}

	public int getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}

	@Override
	public String toString() {
		return "Gate [gateNumber=" + gateNumber + "]";
	}

}

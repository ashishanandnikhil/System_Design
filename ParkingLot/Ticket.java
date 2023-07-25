package ParkingLot;

public class Ticket {

	private int ticketId;
	private Long entryTime;
	private Vehicle vehicle;
	private int parkingGateNumber;
	private ParkingSpot parkingSpot;

	public Ticket(int ticketId, Vehicle vehicle, int parkingGateNumber, ParkingSpot parkingSpot) {
		super();
		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.parkingGateNumber = parkingGateNumber;
		this.parkingSpot = parkingSpot;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Long entryTime) {
		this.entryTime = entryTime;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getParkingGateNumber() {
		return parkingGateNumber;
	}

	public void setParkingGateNumber(int parkingGateNumber) {
		this.parkingGateNumber = parkingGateNumber;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", entryTime=" + entryTime + ", vehicle=" + vehicle
				+ ", parkingGateNumber=" + parkingGateNumber + ", parkingSpot=" + parkingSpot + "]";
	}


	
}

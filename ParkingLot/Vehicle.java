package ParkingLot;

public class Vehicle {

	private Person owner;
	private String vehicleNumber;
	private VehicleType vehicleType;

	public Vehicle(Person owner, String vehicleNumber, VehicleType vehicleType) {
		super();
		this.owner = owner;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + "]";
	}

}

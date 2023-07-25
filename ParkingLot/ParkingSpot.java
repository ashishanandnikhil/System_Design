package ParkingLot;

public class ParkingSpot {

	int SpotId;
	boolean isEmpty;
	Vehicle vehicle;
	VehicleType vehicleType;
	int price;

	public ParkingSpot(int spotId, boolean isEmpty, VehicleType vehicleType) {
		this.SpotId = spotId;
		this.isEmpty = isEmpty;
		this.vehicleType = vehicleType;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getSpotId() {
		return SpotId;
	}

	public void setSpotId(int spotId) {
		SpotId = spotId;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ParkingSpot [SpotId=" + SpotId + ", isEmpty=" + isEmpty + ", vehicle=" + vehicle + ", vehicleType="
				+ vehicleType + ", price=" + price + "]";
	}

}

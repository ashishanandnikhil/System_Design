package ParkingLot;

public enum VehicleType {

	TWO_WHEELER(20),
	FOUR_WHEELER(60);
	
	private int farePrice;
	
	private VehicleType(int price) {
		this.farePrice = price;
	}
	
	public int getFarePrice() {
		return farePrice;
	}
}

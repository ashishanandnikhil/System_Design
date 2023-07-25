package ParkingLot;

public class ParkingSpace {

	private static volatile ParkingSpace INSTANCE = null;

	private ParkingSpace() {
		
	}

	public static ParkingSpace getInstance() {
		synchronized (ParkingSpace.class) {
			if (INSTANCE == null) {
				INSTANCE = new ParkingSpace();
			}
			return INSTANCE;
		}
	}


	
}

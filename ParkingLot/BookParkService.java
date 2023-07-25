package ParkingLot;

public class BookParkService implements IBookParkService {

	ParkingService parkingservice;
	
	public BookParkService(ParkingService parkingService) {
		this.parkingservice = parkingService;
	}

	@Override
	public Ticket bookParking(int parkingGateNumber, Vehicle vehicle) {
		
		return parkingservice.bookParking(parkingGateNumber, vehicle);
	}

	
}

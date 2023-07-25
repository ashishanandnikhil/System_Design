package ParkingLot;

public abstract class Staff extends Person {
	
	BookParkService parkService;

	public Staff(String name, String age, String address, String emailId,BookParkService parkService) {
		super(name, age, address, emailId);
		this.parkService = parkService;
		
	}



}

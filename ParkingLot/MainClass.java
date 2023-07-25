package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<ParkingSpot> parkingSpots = new ArrayList<>();
		parkingSpots.add(new ParkingSpot(1, true, VehicleType.FOUR_WHEELER));
		parkingSpots.add(new ParkingSpot(2, true, VehicleType.TWO_WHEELER));
		parkingSpots.add(new ParkingSpot(3, true, VehicleType.FOUR_WHEELER));
		parkingSpots.add(new ParkingSpot(4, true, VehicleType.TWO_WHEELER));
		
		Person nikhil = new Person("Ashish", "25", "patna", "ashishanand.nikhil@gmail.com");
		Vehicle Tiago = new Vehicle(nikhil, "KA03NB2234", VehicleType.FOUR_WHEELER);
		Person bhaiya = new Person("Abhijeet", "29", "bangalore", "abhijeet.anand804@gmail.com");
		Vehicle seltos = new Vehicle(bhaiya, "KA01MX5897", VehicleType.FOUR_WHEELER);
		
		ParkingSpot parkingSpot = parkingSpots.get(0);
		TicketService ticketService = new TicketService();
		ParkingService parkingService = new ParkingService(parkingSpot, ticketService);
		
		Staff bookTicket = new Staff("ramu", "40", "bangalore", "ramu@gmail.com",new BookParkService(parkingService) );

	}

}

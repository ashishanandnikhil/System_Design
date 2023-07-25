package ParkingLot;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class TicketService {
	
	HashMap<Person, Ticket> ticketsCollection = new HashMap<>();
	
	public Ticket getTicket(int parkingGateNumber,ParkingSpot parkingSpot,Vehicle vehicle) {
		
		Ticket ticket = new Ticket(new Random().nextInt(), vehicle, parkingGateNumber, parkingSpot);
		ticketsCollection.put(vehicle.getOwner(), ticket);
		return ticket;
		
	}
	
	public double getParkingFare(Ticket ticket) {
		long now = new Date().getTime();
		int farePrice = ticket.getVehicle().getVehicleType().getFarePrice();
		ticketsCollection.remove(ticket.getVehicle().getOwner());
		return now * farePrice;
	}
	
	public HashMap<Person, Ticket> getTicketCollection() {
		return ticketsCollection;
	}
}

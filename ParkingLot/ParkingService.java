package ParkingLot;

public class ParkingService implements IParkingService{
	
	ParkingSpot parkingSpot;
	TicketService ticketService;

	public ParkingService(ParkingSpot parkingSpot,TicketService ticketService) {
		this.parkingSpot = parkingSpot;
		this.ticketService = ticketService;
	}

	@Override
	public Ticket bookParking(int parkingGateNo, Vehicle vehicle) {
		
		if(parkingSpot.getVehicleType() == vehicle.getVehicleType() && parkingSpot.isEmpty == true) {
			parkingSpot.setVehicle(vehicle);
			parkingSpot.isEmpty = false;
		}
		return ticketService.getTicket(parkingGateNo, parkingSpot, vehicle);
	}

}

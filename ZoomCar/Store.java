package ZoomCar;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	int storeId;
	VehicleInventoryManagement inventoryManagement;
	Location storeLocation;
	List<Reservation> reservations = new ArrayList<>();
	
	public List<Vehicle> getVehicles(VehicleType vehicleType) {
		return inventoryManagement.getVehicles();
	}
	
	public void setVehicles(List<Vehicle> vehicles) {
		inventoryManagement = new VehicleInventoryManagement(vehicles);
	}
	
	public Reservation createReservation(Vehicle vehicle,User user) {
		Reservation reservation = new Reservation();
		reservation.createReservation(user,vehicle);
		reservation.add(reservation);
		return reservation;
	}
	
	public boolean completeReservation(int reservationID) {
		return true;
	}
}

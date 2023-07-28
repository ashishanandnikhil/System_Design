package ZoomCar;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<User> users = addUser();
		List<Vehicle> vehicles = addVehicles();
		List<Store> stores = addStores(vehicles);
		VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores,users);
		
		User user = users.get(0);
		
//		User user = new User(1,"Ashish",255-0154545623);
		Location location = new Location("panathur", "bangalore", "karnataka", "560087");
		Store store = rentalSystem.getStore(location);
		
		List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);
		
		
		Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));
		
		Bill bill = new Bill(reservation);
		
		Payment payment = new Payment();
		payment.payBill(bill);
		
		store.completeReservation(reservation.reservationId);

	}


	private static List<User> addUser() {
		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setUserId(1);
		users.add(user1);
		return users;
	}
	
	private static List<Store> addStores(List<Vehicle> vehicles) {
		List<Store> stores = new ArrayList<>();
		Store store1 = new Store();
		store1.storeId = 1;
		store1.setVehicles(vehicles);
		stores.add(store1);
		return stores;
	}

	


	private static List<Vehicle> addVehicles() {
		
		List<Vehicle> vehicles = new ArrayList<>(); 
		Vehicle vehicle1 = new Car();
		vehicle1.setVehicleID(1);
		vehicle1.setVehicleType(VehicleType.CAR);
		
		Vehicle vehicle2 = new Car();
		vehicle2.setVehicleID(2);
		vehicle2.setVehicleType(VehicleType.CAR);
		
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		return vehicles;
	}
}

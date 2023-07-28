package ZoomCar;

import java.util.List;

public class VehicleRentalSystem {

	List<User> user_List;
	List<Store> store_List;

	public VehicleRentalSystem(List<Store> stores, List<User> users) {
		this.user_List = users;
		this.store_List = stores;
	}

	public Store getStore(Location location) {

		switch (location.getCity()) {
		case "Bangalore":
			return store_List.get(0);
		}
		return null;
	}

	public void addUser(User user) {
		user_List.add(user);
	}

	public void addStore(Store store) {
		store_List.add(store);
	}

}

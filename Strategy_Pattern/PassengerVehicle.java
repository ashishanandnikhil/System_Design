package Strategy_Pattern;

public class PassengerVehicle extends Vehicle{

	PassengerVehicle() {
		super(new NormalDriveStrategy());
		
	}

}

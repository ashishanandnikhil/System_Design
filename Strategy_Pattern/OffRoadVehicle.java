package Strategy_Pattern;

public class OffRoadVehicle extends Vehicle{

	OffRoadVehicle() {
		super(new SpecialDriveStrategy());
		
	}

}

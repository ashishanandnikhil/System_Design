package Strategy_Pattern;

public class SportsVehicle extends Vehicle {

	SportsVehicle() {
		super(new SpecialDriveStrategy());
		
	} 
	

}

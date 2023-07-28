package ZoomCar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
	
	int reservationId;
	User user;
	Vehicle vehicle;
	Date bookingDate;
	Date dateBookedFrom;
	Date dateBookedTo;
	Long fromTimeStamp;
	Long toTimeStamp;
	Location pickUpLocation;
	Location dropLocation;
	ReservationType reservationType;
	ReservationStatus reservationStatus;
	Location location;
	
	
	public int createReservation(User user, Vehicle vehicle) {
		
		reservationId = 12232;
		this.user = user;
		this.vehicle = vehicle;
		reservationType = ReservationType.DAILY;
		reservationStatus = ReservationStatus.SCHEDULED;
		return reservationId;
		
	}
	
	public void add(Reservation reservation) {
		
		List<Reservation> reservationList = new ArrayList<>();
		reservationList.add(reservation);
	}
}

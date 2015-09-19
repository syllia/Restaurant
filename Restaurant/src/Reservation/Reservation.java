package Reservation;


import java.util.Date;
import java.util.UUID;

public class Reservation {

	private UUID reservationId;
	private int numberOfSeats;
	private Date checkInDate;
	private others.Restaurant restaurant;
	private UUID clientId;
	private Date reservationDate;
	private ReservationStatus status;
	private int duration;
	
	public Reservation(UUID p_reservationId,int p_numberOfSeats,Date p_checkInDate,
						others.Restaurant p_restaurant,
						UUID p_clientId,Date p_reservationDate,ReservationStatus p_status,
						int p_duration) {
		reservationDate =p_reservationDate ;
		numberOfSeats = p_numberOfSeats;
		checkInDate=p_checkInDate;
		restaurant =p_restaurant;
		clientId =p_clientId;
		reservationDate =p_reservationDate; 
		status =p_status;
		duration =p_duration;
		
	}
	public void setDate() {
		// TODO - implement Reservation.setDate
		throw new UnsupportedOperationException();
	}

	public void setNumberOfSeats() {
		// TODO - implement Reservation.setNumberOfSeats
		throw new UnsupportedOperationException();
	}

}
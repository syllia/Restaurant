package com.team.jmaps.bookeatnow.domain.Restaurant.Reservation;

import Order.*;
import Restaurant.*;

public class ReservationManager {

	private Reservation[] reservations;

	/**
	 * 
	 * @param id
	 */
	public Reservation searchById(Uid id) {

	}

	/**
	 * 
	 * @param date
	 */
	public Reservation[] searchByReservationDate(Date date) {

	}

	/**
	 * 
	 * @param date
	 */
	public Reservation[] searchByCheckInDate(Date date) {

	}

	/**
	 * 
	 * @param restaurantId
	 */
	public Reservation[] searchByRestaurant(Uid restaurantId) {

	}

	/**
	 * 
	 * @param restaurantId
	 */
	public Reservation[] searchByClient(Uid restaurantId) {

	}

	/**
	 * 
	 * @param reservation
	 */
	private boolean checkAvailability(Reservation reservation) {

	}

	/**
	 * 
	 * @param reservationId
	 */
	public boolean cancelReservation(Uid reservationId) {
		// TODO - implement ReservationManager.cancelReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newReservation
	 */
	public boolean registerReservation(Reservation newReservation) {

	}

	/**
	 * 
	 * @param newReservation
	 */
	private void notifyForNewReservation(Order newReservation) {

	}

	/**
	 * 
	 * @param reservationId
	 */
	private void notifyForCancellation(Uid reservationId) {
		// TODO - implement ReservationManager.notifyForCancellation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newReservation
	 */
	private void notifyForModification(Reservation newReservation) {

	}

	/**
	 * 
	 * @param aRestaurant
	 */
	public boolean addToHistory(Restaurant aRestaurant) {
		// TODO - implement ReservationManager.addToHistory
		throw new UnsupportedOperationException();
	}

}
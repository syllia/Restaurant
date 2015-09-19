package others;
import java.util.UUID;

import Reservation.*;
import Menu.*;
//package com.team.jmaps.bookeatnow.domain.Restaurant;

/*import User.*;
import Restaurant.Reservation.*;
import Order.*;
import Restaurant.Menu.*;*/

public class Restaurant /*extends Member*/ {

	private String restaurantLogoPath;
	private String restaurantName;
	private String descriptionImagesPath;
	private int capacity;
	private int numberOfSeatRemaining;
	private Comment[] comments;
	private Appreciation appreciation;
	private Service service;

	/**
	 * 
	 * @param newReservation
	 */
	public boolean registerReservation(Reservation newReservation) {
		return false;

	}

	/**
	 * 
	 * @param newOrder
	 */
	/*public boolean registerDeliveryOrder(Order newOrder) {

	}*/

	/**
	 * 
	 * @param menuName
	 * @param description
	 */
	public void createNewMenu(String menuName, String description) {
		// TODO - implement Restaurant.createNewMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newFood
	 */
	public void addFood(MenuItem newFood) {

	}

	/**
	 * 
	 * @param newReservation
	 */
	public boolean acceptsReservation(Reservation newReservation) {
		return false;
	}

	/**
	 * 
	 * @param menuId
	 * @param foodId
	 */
	public void addFoodToMenu(UUID menuId, UUID foodId) {
		// TODO - implement Restaurant.addFoodToMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param menuId
	 * @param sousMenuId
	 */
	public void addSousMenuToMenu(UUID menuId, UUID sousMenuId) {
		// TODO - implement Restaurant.addSousMenuToMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param comment
	 */
	public void registerNewComment(Comment comment) {
		// TODO - implement Restaurant.registerNewComment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param isPositif
	 */
	public void registerAVote(boolean isPositif) {
		// TODO - implement Restaurant.registerAVote
		throw new UnsupportedOperationException();
	}

}
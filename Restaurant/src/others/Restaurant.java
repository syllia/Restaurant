package others;
import java.util.ArrayList;
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
	private ArrayList<Comment> comments;
	private Appreciation appreciation;
	private Service service;
	
	

	public Restaurant(String restaurantLogoPath, String restaurantName,
			String descriptionImagesPath, int capacity,
			int numberOfSeatRemaining, Comment comments,
			Appreciation appreciation, Service service) {
		super();
		this.restaurantLogoPath = restaurantLogoPath;
		this.restaurantName = restaurantName;
		this.descriptionImagesPath = descriptionImagesPath;
		this.capacity = capacity;
		this.numberOfSeatRemaining = numberOfSeatRemaining;
		this.comments.set(0,comments);
		this.appreciation = appreciation;
		this.service = service;
	}
	
	

	public String getRestaurantLogoPath() {
		return restaurantLogoPath;
	}



	public void setRestaurantLogoPath(String restaurantLogoPath) {
		this.restaurantLogoPath = restaurantLogoPath;
	}



	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}



	public String getDescriptionImagesPath() {
		return descriptionImagesPath;
	}



	public void setDescriptionImagesPath(String descriptionImagesPath) {
		this.descriptionImagesPath = descriptionImagesPath;
	}



	public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public int getNumberOfSeatRemaining() {
		return numberOfSeatRemaining;
	}



	public void setNumberOfSeatRemaining(int numberOfSeatRemaining) {
		this.numberOfSeatRemaining = numberOfSeatRemaining;
	}



	public Comment getComments(int index) {
		return comments.get(index);
	}

/*
	public void setComments(Comment[] comments) {
		this.comments = comments;
	}
*/


	public Appreciation getAppreciation() {
		return appreciation;
	}



	public void setAppreciation(Appreciation appreciation) {
		this.appreciation = appreciation;
	}



	public Service getService() {
		return service;
	}



	public void setService(Service service) {
		this.service = service;
	}



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
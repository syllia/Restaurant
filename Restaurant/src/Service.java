//package com.team.jmaps.bookeatnow.domain.Restaurant;

public class Service {

	private boolean reservation_allowed;
	private boolean delivery_allowed;
	private boolean order_and_pickup_allowed;
	
	public Service(boolean reservation_allowed, boolean delivery_allowed,
			boolean order_and_pickup_allowed) {
		super();
		this.reservation_allowed = reservation_allowed;
		this.delivery_allowed = delivery_allowed;
		this.order_and_pickup_allowed = order_and_pickup_allowed;
	}

	public boolean isReservation_allowed() {
		return reservation_allowed;
	}

	public void setReservation_allowed(boolean reservation_allowed) {
		this.reservation_allowed = reservation_allowed;
	}

	public boolean isDelivery_allowed() {
		return delivery_allowed;
	}

	public void setDelivery_allowed(boolean delivery_allowed) {
		this.delivery_allowed = delivery_allowed;
	}

	public boolean isOrder_and_pickup_allowed() {
		return order_and_pickup_allowed;
	}

	public void setOrder_and_pickup_allowed(boolean order_and_pickup_allowed) {
		this.order_and_pickup_allowed = order_and_pickup_allowed;
	}
	
	
	
	

}
import java.sql.Time;



//package com.team.jmaps.bookeatnow.domain.Restaurant;

public class BusinessHours {

	private Time opening;
	private Time closing;
	
	
	public BusinessHours(Time opening, Time closing) {
		super();
		this.opening = opening;
		this.closing = closing;
	}
	public Time getOpening() {
		return opening;
	}
	public void setOpening(Time opening) {
		this.opening = opening;
	}
	public Time getClosing() {
		return closing;
	}
	public void setClosing(Time closing) {
		this.closing = closing;
	}
	
	

}
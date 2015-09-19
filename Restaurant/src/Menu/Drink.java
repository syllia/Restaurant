//package com.team.jmaps.bookeatnow.domain.Restaurant.Menu;
package Menu;

public class Drink extends MenuItem {

	
	private String image_path;
	
	public Drink(String p_name, String p_description, float p_price) {
		super(p_name, p_description, p_price);
		// TODO Auto-generated constructor stub
	}
	
	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

}
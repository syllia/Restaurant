package others;
//package com.team.jmaps.bookeatnow.domain.Restaurant;

public class Informations {

	private Address adresse;
	private String telephone;
	private String postalCode;
	private BusinessHours[] businessHours;
	private BusinessHours[] deliveryHours;
	
	public Informations(Address adresse, String telephone, String postalCode,
			BusinessHours[] businessHours, BusinessHours[] deliveryHours) {
		super();
		this.adresse = adresse;
		this.telephone = telephone;
		this.postalCode = postalCode;
		this.businessHours = businessHours;
		this.deliveryHours = deliveryHours;
	}

	public Address getAdresse() {
		return adresse;
	}

	public void setAdresse(Address adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public BusinessHours[] getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(BusinessHours[] businessHours) {
		this.businessHours = businessHours;
	}

	public BusinessHours[] getDeliveryHours() {
		return deliveryHours;
	}

	public void setDeliveryHours(BusinessHours[] deliveryHours) {
		this.deliveryHours = deliveryHours;
	}
	
	
	

}
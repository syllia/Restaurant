

public class Address {

	private int civicNumber;
	private String streetName;
	private String city;
	private String postalCode;
	private String state;
	
	public Address(int civicNumber, String streetName, String city,
			String postalCode, String state, String country) {
		super();
		this.civicNumber = civicNumber;
		this.streetName = streetName;
		this.city = city;
		this.postalCode = postalCode;
		this.state = state;
		this.country = country;
	}
	
	public int getCivicNumber() {
		return civicNumber;
	}
	public void setCivicNumber(int civicNumber) {
		this.civicNumber = civicNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String country;

}
package Menu;

public class MenuItem {

	private String name;
	private String description;
	private float price;
	
	public MenuItem(String p_name,String p_description,float p_price) {
		name=p_name;
		description =p_description;
		price=p_price;
	}
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

}
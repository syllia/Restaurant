package Menu;

public class Meal extends MenuItem {

	private String image_path;
	
	
	public Meal(String p_name, String p_description, float p_price,
			String image_path) {
		super(p_name, p_description, p_price);
		this.image_path = image_path;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

}
package Menu;

public class SousMenu {

	private Menu_Type type;
	private String description;
	
	public SousMenu(Menu_Type p_type,String p_description) {
		type =p_type ;
		description =p_description;
				
		// TODO Auto-generated constructor stub
	}
		
	public Menu_Type getType() {
		return type;
	}
	public void setType(Menu_Type type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
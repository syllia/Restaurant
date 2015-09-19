package Menu;

public class Menu extends SousMenu {

	private SousMenu setOfSousMenu;

	public Menu(Menu_Type p_type, String p_description, SousMenu setOfSousMenu) {
		super(p_type, p_description);
		this.setOfSousMenu = setOfSousMenu;
	}

	public SousMenu getSetOfSousMenu() {
		return setOfSousMenu;
	}

	public void setSetOfSousMenu(SousMenu setOfSousMenu) {
		this.setOfSousMenu = setOfSousMenu;
	}

}
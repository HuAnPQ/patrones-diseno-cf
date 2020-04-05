package composite;

import java.util.ArrayList;

public class Menu implements IMenu {
	
	private ArrayList<IMenu> menus;
	
	public Menu() {
		this.menus = new ArrayList<IMenu>();
	}

	@Override
	public boolean open() {
		System.out.println("Open!");
		return true;
	}

	@Override
	public boolean close() {
		System.out.println("Closed!");
		return true;
	}
	
	public void addMenu(IMenu menu) {
		this.menus.add(menu);
	}

	public IMenu getMenu(int posicion) {
		return this.menus.get(posicion);
	}

	@Override
	public String toString() {
		return "Menu [ menus => " + menus + "]";
	}
	
	
}

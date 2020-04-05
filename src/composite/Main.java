package composite;

public class Main {

	public static void main(String[] args) {
		Menu menu1 = new Menu();
		Menu menu2 = new Menu();
		Menu menu3 = new Menu();
		Menu menu4 = new Menu();
		Menu menu5 = new Menu();
		
		menu3.addMenu(menu4);
		menu5.addMenu(menu5);
		
		menu1.addMenu(menu2);
		menu1.addMenu(menu3);
		
		System.out.println(menu1);
	}

}

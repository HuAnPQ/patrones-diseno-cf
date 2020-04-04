package poo;

public class Main {

	public static void main(String[] args) {

		Jaguar nico = new Jaguar(26, 87f);
		
		System.out.println(nico);
		nico.comer();
		nico.dormir();
		
		nico.cazar();
		nico.rugir();
		//nico.maullar();
	}

}

package poo;

public class Main {

	public static void main(String[] args) {

		IFelinoSalvaje nico = new Jaguar(26, 87f);
		
		System.out.println(nico);  //Jaguar
		nico.cazar();  //IFelino
		nico.rugir();  //IFelinoSalvaje
	}

}

package simpleFactory;

public class Main {

	public static void main(String[] args) {
		Pizzeria pizzeriaCF = new Pizzeria();
		Pizza pPeperoni = pizzeriaCF.crearPizzaChica();
		System.out.println(pPeperoni);
	}

}

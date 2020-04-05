package factoryMethod;

public class Main {

	public static void main(String[] args) {
		PizzeriaCF pizzeriaCF = new PizzeriaCF();
		
		Pizza pizzaPeperoni = pizzeriaCF.crearPizza("Peperoni");
		Pizza pizzaHawaiana = pizzeriaCF.crearPizza("Hawaiana");
		Pizza pizzaPeperoniOR = pizzeriaCF.crearPizza("Peperoni con orilla rellena");
		
		System.out.println(pizzaPeperoni);
		System.out.println(pizzaHawaiana);
		System.out.println(pizzaPeperoniOR);
	}

}

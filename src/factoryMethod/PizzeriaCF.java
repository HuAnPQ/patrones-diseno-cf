package factoryMethod;

public class PizzeriaCF implements IPizzeria {

	public Pizza crearPizza(String tipo) {
		if(tipo.equals("Peperoni")) {
			return new Pizza(8, tipo);
		}
		if(tipo.equals("Hawaiana")) {
			return new Pizza(6, tipo);
		}
		if(tipo.equals("Peperoni con orilla rellena")) {
			return new PizzaOrillaRellena(12, tipo);
		}
		return null;
	}

}

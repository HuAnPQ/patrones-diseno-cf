package decorator;

public class Main {

	public static void main(String[] args) {
		IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());
		IPizza pizzaHawaiana = new OrillaRellenaQueso(new PizzaHawaiana());
		
		System.out.println(pizzaPeperoni.descripcion());
		System.out.println(pizzaPeperoni.precio());
		
		System.out.println(pizzaHawaiana.descripcion());
		System.out.println(pizzaHawaiana.precio());
	}

}

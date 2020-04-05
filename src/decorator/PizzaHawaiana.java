package decorator;

public class PizzaHawaiana implements IPizza{

	@Override
	public String descripcion() {
		return "Pizza Hawaiana";
	}

	@Override
	public float precio() {
		return 7;
	}

}

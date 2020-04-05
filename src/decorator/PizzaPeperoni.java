package decorator;

public class PizzaPeperoni implements IPizza{

	@Override
	public String descripcion() {
		return "Pizza de peperoni";
	}

	@Override
	public float precio() {
		return 8;
	}

}

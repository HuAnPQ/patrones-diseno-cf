package decorator;

public class OrillaRellenaQueso implements IPizza {
	
	private IPizza pizza;
	
	public OrillaRellenaQueso(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String descripcion() {
		return this.pizza.descripcion() + " orilla rellena de queso";
	}

	@Override
	public float precio() {
		return this.pizza.precio() + 4;
	}

}

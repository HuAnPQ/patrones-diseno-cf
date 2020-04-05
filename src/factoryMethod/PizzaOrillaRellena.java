package factoryMethod;

public class PizzaOrillaRellena extends Pizza {

	public PizzaOrillaRellena(int cantidadRebanadas, String especialidad) {
		super(cantidadRebanadas, especialidad);
	}

	@Override
	public String toString() {
		return "Pizza con Orilla rellena --> Cantidad rebanadas: " + this.getCantidadRebanadas() + 
				"| Especialidad: " + this.getEspecialidad();
	}
	
}

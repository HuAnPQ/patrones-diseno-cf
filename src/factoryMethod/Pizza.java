package factoryMethod;

public class Pizza {

	private int cantidadRebanadas;
	private String especialidad;
	
	public Pizza (int cantidadRebanadas, String especialidad) {
		this.cantidadRebanadas = cantidadRebanadas;
		this.especialidad = especialidad;
	}
	
	public String toString() {
		return "Cantidad rebanadas: " + this.cantidadRebanadas + 
				"| Especialidad: " + this.especialidad;
	}

	public int getCantidadRebanadas() {
		return cantidadRebanadas;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	
}

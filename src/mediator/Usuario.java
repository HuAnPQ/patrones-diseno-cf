package mediator;

public class Usuario {
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	public void recibirMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}

package Builder;

public class Usuario {
	
	private String nombre;
	private String apellido;
	
	private String email;
	private String telefono;
	private String direccion;
	
	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}

	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = "";
		this.telefono = "";
		this.direccion = "";
	}
	
	public static Usuario Make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}
	
	public Usuario Build() {
		return this;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + this.nombre +
				", apellido=" + this.apellido +
				", email=" + this.email +
				", telefono=" + this.telefono +
				", direccion=" + this.direccion + "]";
	}

}

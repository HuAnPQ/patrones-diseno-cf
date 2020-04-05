package Builder;

public class Usuario {
	
	private String nombre;
	private String apellido;
	
	private boolean medioContacto;
	
	private String email;
	private String telefono;
	private String direccion;
	
	private String metodoPago;
	private String token;
	
	public BuilderUsuario setMedioContacto(boolean medioContacto) {
		if(!medioContacto) {
			throw new IllegalArgumentException(
					"No es posible asignar un valor falso a medio de contacto");
		}
		this.medioContacto = medioContacto;
		return new BuilderUsuario(this);
	}

	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.medioContacto = false;
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
				", direccion=" + this.direccion + 
				", metodoPago=" + this.metodoPago + 
				", token=" + this.token + "]";
	}

	public static class BuilderUsuario {
		private Usuario usuario;
		
		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		public BuilderUsuario setEmail(String email) {
			this.usuario.email = email;
			return this;
		}

		public BuilderUsuario setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}

		public BuilderUsuario setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}
		
		public BuilderUsuarioToken setMetodoPago(String metodoPago) {
			if(!usuario.email.isEmpty() && !usuario.telefono.isEmpty() && !usuario.direccion.isEmpty() && !metodoPago.isEmpty()) {
				usuario.metodoPago = metodoPago;
			}else {
				throw new IllegalArgumentException(
						"No es posible asignar un valor a metodo de pago, sin primero ingresar Direccion, Telefono y Email.");
			}
			return new BuilderUsuarioToken(usuario);
		}
		
		public Usuario Build() {
			return usuario;
		}

	}
	
	public static class BuilderUsuarioToken {
		private Usuario usuario;
		
		public BuilderUsuarioToken(Usuario usuario) {
			this.usuario = usuario;
		}
		
		public BuilderUsuarioToken setToken(String token) {
			this.usuario.token = token;
			return this;
		}
		
		public Usuario Build() {
			return usuario;
		}
	}
}

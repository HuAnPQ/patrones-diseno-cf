package proxy;

public class ProxyServicio implements IServicio {
	private IServicio servicio;
	private Usuario usuario;

	public ProxyServicio(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public void escribir() {
		if (this.esAdmin()) {
			this.obtenerServicio().escribir();
		} else {
			throw new UnsupportedOperationException("Error de seguridad");
		}
	}

	@Override
	public void leer() {
		this.obtenerServicio().leer();
	}

	@Override
	public void actualizar() {
		if (this.esAdmin()) {
			this.obtenerServicio().actualizar();
		} else {
			throw new UnsupportedOperationException("Error de seguridad");
		}
	}

	@Override
	public void eliminar() {
		if (this.esAdmin()) {
			this.obtenerServicio().eliminar();
		} else {
			throw new UnsupportedOperationException("Error de seguridad");
		}
	}

	private boolean esAdmin() {
		return (this.usuario.getNivelPermiso() >= 5);
	}

	private IServicio obtenerServicio() {
		if (this.servicio == null) {
			this.servicio = new Servicio();
		}
		return this.servicio;
	}

}

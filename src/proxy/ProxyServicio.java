package proxy;

public class ProxyServicio implements IServicio{
	private IServicio servicio;
	private Usuario usuario;

	public ProxyServicio(IServicio servicio, Usuario usuario) {
		this.servicio = servicio;
		this.usuario = usuario;
	}

	@Override
	public void escribir() {
		if(this.esAdmin()) {
			this.servicio.escribir();
		}else {
			throw new UnsupportedOperationException("Error de seguridad");
		}
	}

	@Override
	public void leer() {
		this.servicio.leer();
	}

	@Override
	public void actualizar() {
		if(this.esAdmin()) {
			this.servicio.actualizar();
		}else {
			throw new UnsupportedOperationException("Error de seguridad");
		}
	}

	@Override
	public void eliminar() {
		if(this.esAdmin()) {
			this.servicio.eliminar();
		}else {
			throw new UnsupportedOperationException("Error de seguridad");
		}
	}
	
	private boolean esAdmin() {
		return (this.usuario.getNivelPermiso() >= 5);
	}

}

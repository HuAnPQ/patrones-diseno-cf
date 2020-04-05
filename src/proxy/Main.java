package proxy;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario(5);
		IServicio servicio = new ProxyServicio(usuario);

		servicio.escribir();
		servicio.leer();
		servicio.actualizar();
		servicio.eliminar();
	}

}

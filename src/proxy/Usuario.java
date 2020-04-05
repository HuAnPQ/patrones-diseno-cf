package proxy;

public class Usuario {
	private int nivelPermiso;	//1 - 5 == Admin
	
	public int getNivelPermiso() {
		return nivelPermiso;
	}

	public void setNivelPermiso(int nivelPermiso) {
		this.nivelPermiso = nivelPermiso;
	}

	public Usuario(int nivelPermiso) {
		this.nivelPermiso = nivelPermiso;
	}

}

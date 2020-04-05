package prototype;

public class Enemigo {
	
	private String imagen;
	private int posX;
	private int posY;
	private int cantidadVida;
	
	public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
		this.setImagen(imagen);
		this.setPosX(posX);
		this.setPosY(posY);
		this.setCantidadVida(cantidadVida);
	}

	public Enemigo(Enemigo enemigoBase) {
		this.setImagen(enemigoBase.getImagen());
		this.setPosX(enemigoBase.getPosX());
		this.setPosY(enemigoBase.getPosY());
		this.setCantidadVida(enemigoBase.getCantidadVida());
	}
	
	public Enemigo clone() {
		//return new Enemigo(this);
		return new Enemigo(this.getImagen(), this.getPosX(), this.getPosY(), this.getCantidadVida());
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setCantidadVida(int cantidadVida) {
		this.cantidadVida = cantidadVida;
	}

	public String getImagen() {
		return imagen;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getCantidadVida() {
		return cantidadVida;
	}

	@Override
	public String toString() {
		return "Enemigo [imagen=" + imagen + 
				", posX=" + posX + 
				", posY=" + posY + 
				", cantidadVida=" + cantidadVida + "]";
	}
	
}

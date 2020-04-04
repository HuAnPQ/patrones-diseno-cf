package poo;

public class Jaguar extends Animal implements IFelino {
	
	private int edad;
	private float peso;
	
	public Jaguar() {
		this.setEdad(0);
		this.setPeso(0.0f);
	}
	
	public Jaguar(int edad, float peso) {
		this.setEdad(edad);
		this.setPeso(peso);
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "La edad del Jaguar es " + this.edad + " y el peso es " + this.peso;
	}
	
	public void dormir() {
		System.out.println("El Jaguar duerme!");
	}
	
	public void comer() {
		System.out.println("El Jaguar come!");
	}

	public void rugir() {
		System.out.println("El Jaguar ruge");
	}

	public void maullar() {
		throw new UnsupportedOperationException("El jaguar no maulla");
	}

	public void cazar() {
		System.out.println("El jaguar caza!");
	}
	
}

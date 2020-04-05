package observer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements IObservable{
	private int stock;
	private Set<IObserver> observadores;

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Producto(int stock) {
		this.stock = stock;
		this.observadores = new LinkedHashSet<>();
	}
	
	public void venta() {
		this.setStock(this.stock - 1);
		System.out.println("Producto vendido!");
		
		this.notificarObservadores();
	}

	@Override
	public void addObserver(IObserver ob) {
		this.observadores.add(ob);
	}

	@Override
	public void notificarObservadores() {
		for (IObserver observador: this.observadores) {
			observador.notificacion("El producto se vendio!");
		}
	}

	@Override
	public void removeObserver() {
		// TODO Auto-generated method stub
		
	}

}

package state;

public class AutoEncender implements IEstadoAuto {
	private final Auto auto;
	
	public AutoEncender(Auto auto) {
		this.auto = auto;
	}

	@Override
	public void encender() {
		System.out.println("El auto esta encendido!");
	}

	@Override
	public void manejar() {
		System.out.println("El auto esta en movimiento!");
		auto.setEstadoActual(auto.getAutoMovimiento());
	}

	@Override
	public void apagar() {
		System.out.println("El auto esta apagado!");
		auto.setEstadoActual(auto.getAutoApagado());
	}

}

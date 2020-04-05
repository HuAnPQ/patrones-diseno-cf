package state;

public class AutoManejar implements IEstadoAuto{
	private final Auto auto;
	
	public AutoManejar(Auto auto) {
		this.auto = auto;
	}

	@Override
	public void encender() {
		System.out.println("El auto ya esta encendido!");
	}

	@Override
	public void manejar() {
		System.out.println("El auto ya se esta en movimiento!");
	}

	@Override
	public void apagar() {
		System.out.println("El auto esta apagado!");
		auto.setEstadoActual(auto.getAutoApagado());
	}

}

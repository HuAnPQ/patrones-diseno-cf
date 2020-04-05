package chainResponsibility;

public class Retiro implements IManejadorTransacciones {
	private IManejadorTransacciones next;

	@Override
	public void setNextManejador(IManejadorTransacciones next) {
		this.next = next;
	}

	@Override
	public void ejecutarTransaccion(Transaccion transaccion) {
		if(transaccion.getTipoTransaccion() == TipoTransaccion.Retiro) {
			float balance = transaccion.getBalance() - transaccion.getCantidad();
			System.out.println("El balance luego del retiro es: " + balance);
		}else {
			this.next.ejecutarTransaccion(transaccion);
		}
	}

}

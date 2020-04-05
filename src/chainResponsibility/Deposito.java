package chainResponsibility;

public class Deposito implements IManejadorTransacciones{
	private IManejadorTransacciones next;

	@Override
	public void setNextManejador(IManejadorTransacciones next) {
		this.next = next;
	}

	@Override
	public void ejecutarTransaccion(Transaccion transaccion) {
		if(transaccion.getTipoTransaccion() == TipoTransaccion.Deposito) {
			float balance = transaccion.getBalance() + transaccion.getCantidad();
			System.out.println("El nuevo balance despues de un deposito es: " + balance);
		}else {
			this.next.ejecutarTransaccion(transaccion);
		}
	}

}

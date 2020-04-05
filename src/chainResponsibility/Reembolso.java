package chainResponsibility;

public class Reembolso implements IManejadorTransacciones{
	private IManejadorTransacciones next;

	@Override
	public void setNextManejador(IManejadorTransacciones next) {
		this.next = next;
	}

	@Override
	public void ejecutarTransaccion(Transaccion transaccion) {
		if(transaccion.getTipoTransaccion() == TipoTransaccion.Reembolso) {
			float balance = transaccion.getBalance() - transaccion.getCantidad();
			System.out.println("El balance luego del reembolso es: " + balance);
		}else {
			System.out.println("Operacion no valida");
		}
	}

}

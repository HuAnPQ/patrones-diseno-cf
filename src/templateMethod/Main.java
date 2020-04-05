package templateMethod;

public class Main {

	public static void main(String[] args) {
		Usuario gerente = new Gerente();
		Usuario admin = new Administrador();
		
		gerente.autenticacion();
		gerente.formaTrabajar();
		
		admin.autenticacion();
		admin.formaTrabajar();
		
	}

}

package visitor;

public class Main {

	public static void main(String[] args) {
		Manzana manzana = new Manzana();
		Lavadora lavadora = new Lavadora();
		IVisitor descComun = new DescuentoComun();
		

		System.out.println(manzana.aplicarDescuento(descComun));
	}

}

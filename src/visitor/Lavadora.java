package visitor;

public class Lavadora implements ILineaBlanca, IVisitable{

	@Override
	public float getPrecio() {
		return 350f;
	}

	@Override
	public float aplicarDescuento(IVisitor visitor) {
		return visitor.visit(this);
	}

}

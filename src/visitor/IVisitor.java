package visitor;

public interface IVisitor {
	float visit(IFruta fruta);

	float visit(ILineaBlanca lineaBlanca);
}

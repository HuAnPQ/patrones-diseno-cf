package solid;

public class Main {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(10, 30);
		Triangulo triangulo = new Triangulo(5, 25);
		Presentacion presentacion = new Presentacion();
		
		presentacion.imprimir(rectangulo);
		presentacion.imprimir(triangulo);

	}

}

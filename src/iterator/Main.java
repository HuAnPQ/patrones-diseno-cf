package iterator;

public class Main {

	public static void main(String[] args) {
		GuiaTelefonica guia = new GuiaTelefonica();

		guia.add("123");
		guia.add("456");
		guia.add("789");
		guia.add("147");
		guia.add("258");
		guia.add("369");

		Iterador iterador = new IteradorGuia(guia);

		while (iterador.contieneSiguiente()) {
			System.out.println(iterador.siguiente());

		}
	}

}

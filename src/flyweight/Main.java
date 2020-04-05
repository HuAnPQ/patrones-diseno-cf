package flyweight;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		NubeFactory factory = new NubeFactory();
		for (int index = 0; index < 100; index++) {
			Nube nube = factory.getNube(TipoNube.Chica);
		}
		for (int index = 0; index < 200; index++) {
			Nube nube = factory.getNube(TipoNube.Mediana);
		}
		for (int index = 0; index < 300; index++) {
			Nube nube = factory.getNube(TipoNube.Grande);
		}
		
		System.out.println(factory.countNubesMap());
	}

}

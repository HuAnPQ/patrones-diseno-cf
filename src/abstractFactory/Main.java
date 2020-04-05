package abstractFactory;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class Main {

	public static void main(String[] args) {
		AppleStore appleStore = new AppleStore();
		SamsungStore samsungStore = new SamsungStore();
		
		IComputadora mac = appleStore.crearComputadora();
		ITable ipad = appleStore.crearTablet();
		
		IComputadora flash = samsungStore.crearComputadora();
		ITable s3 = samsungStore.crearTablet();
		
		System.out.println(mac);
		System.out.println(ipad);
		System.out.println(flash);
		System.out.println(s3);

	}

}

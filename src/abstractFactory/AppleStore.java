package abstractFactory;

public class AppleStore implements IAbstractFactory {

	@Override
	public IComputadora crearComputadora() {
		return new MacbookPro();
	}

	@Override
	public ITable crearTablet() {
		return new IPad();
	}

}

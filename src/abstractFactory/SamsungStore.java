package abstractFactory;

public class SamsungStore implements IAbstractFactory{

	@Override
	public IComputadora crearComputadora() {
		return new NotebookFlash();
	}

	@Override
	public ITable crearTablet() {
		return new TabS3();
	}

}

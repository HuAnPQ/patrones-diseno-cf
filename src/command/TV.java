package command;

public class TV implements IDevise{
	private boolean on;

	public TV() {
		this.on = false;
	}

	@Override
	public void on() {
		this.on = true;
		System.out.println("TV encendida!");
	}

	@Override
	public void off() {
		this.on = false;
		System.out.println("TV apagada!");
	}

}

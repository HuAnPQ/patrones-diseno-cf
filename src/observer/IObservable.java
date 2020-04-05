package observer;

public interface IObservable {
	void addObserver(IObserver ob);
	void notificarObservadores();
	void removeObserver();
}

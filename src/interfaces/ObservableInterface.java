package interfaces;

public interface ObservableInterface {
	public void notifyALL();

	public void add(ObserverInterface observerInterface);

	public void remove(ObserverInterface observerInterface);
}

package observer.obervers;


public class ConcreteObserver implements Observer {

	@Override
	public void update(Object o) {
		System.out.println("Recevied："+o);
	}
}

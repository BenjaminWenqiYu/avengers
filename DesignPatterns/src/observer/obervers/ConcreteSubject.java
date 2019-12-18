package observer.obervers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements  Subject {

	private List<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void attach(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(Object obj) {
		for (Observer observer : observerList) {
			observer.update(obj);
		}
	}

	public  void invoke(){
		for (int i = 0 ;i < 10;i++) {
			System.out.println(i);
			this.notifyObserver(i);
		}
	}
}

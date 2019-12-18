package observer.obervers;

public interface Subject {

	//添加观察者
	void attach(Observer observer);
	//移除观察者
	void detach(Observer observer);
	//通知其他观察者
	void notifyObserver(Object obj);
}

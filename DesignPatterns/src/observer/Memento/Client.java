package observer.Memento;

public class Client {

	public static void main(String[] args) {
		Originator ori = new Originator();
		ori.setName("zhangsan");
		ori.setPhone("123456");
		ori.setBudget(123);

		ori.show();

		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(ori.saveMemento());

		ori.setName("lisi");
		ori.setPhone("7890123");
		ori.setBudget(456);

		ori.show();

		ori.restoreMemento(caretaker.getMemento());

		ori.show();

	}
}

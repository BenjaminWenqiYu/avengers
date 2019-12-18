package observer.state;


public class Client {

	public static void main(String[] args) {
		Car car = new Car();

		car.pull();
		car.pull();
		car.pull();
		car.pull();
	}
}

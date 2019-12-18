package observer.state;

public class High extends State {
	@Override
	public void pull(Car car) {
		car.setState(new Off());
		System.out.println("空档");
	}
}

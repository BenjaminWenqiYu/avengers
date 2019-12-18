package observer.state;

public class Medium extends  State{
	@Override
	public void pull(Car car) {
		car.setState(new High());
		System.out.println("高档");
	}
}

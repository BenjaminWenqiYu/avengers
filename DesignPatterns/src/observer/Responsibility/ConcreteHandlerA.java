package observer.Responsibility;

public class ConcreteHandlerA extends  Handler {

	@Override
	public void handlerRequest(int request) {
		if(request >=0 && request <=10){
			System.out.println();
		}
	}
}

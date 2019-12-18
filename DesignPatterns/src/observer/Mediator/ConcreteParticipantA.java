package observer.Mediator;

public class ConcreteParticipantA  extends Participant{

	public ConcreteParticipantA(String name) {
		super(name);
	}

	@Override
	public void receive(String from, String msg) {
		System.out.println("ConcreteParticipantA " + from + " to "+ super.name + " " + msg);
	}

}

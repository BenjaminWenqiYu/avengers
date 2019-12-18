package observer.Mediator;

public class ConcreteParticipantB extends Participant{

	public ConcreteParticipantB(String name) {
		super(name);
	}

	@Override
	public void receive(String from, String msg) {
		System.out.println("ConcreteParticipantB "+from + " to "+ super.name+" "+msg);
	}
}

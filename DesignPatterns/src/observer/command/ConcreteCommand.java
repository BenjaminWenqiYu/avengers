package observer.command;

public class ConcreteCommand extends  Command {
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void executor() {
		receiver.action();
	}
}

package observer.Mediator;

/**
 * 中介者接口
 */
public interface IChatRoom {
	public void register(Participant participant);
	public void send(String from,String to,String msg);
}

package observer.Mediator;

public abstract class Participant {

	private ChatRoom chatRoom;
	public String name;

	public Participant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}

	public void send(String to,String msg) {
		chatRoom.send(name,to,msg);
	}

	public abstract void receive(String from,String msg);
}

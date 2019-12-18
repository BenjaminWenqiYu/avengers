package observer.Mediator;

public class Client {

	public static void main(String[] args) {
		ChatRoom c = new ChatRoom();

		Participant zhangsan = new ConcreteParticipantA("zhangsan");
		Participant lisi = new ConcreteParticipantA("lisi");
		Participant wangwu = new ConcreteParticipantB("wangwu");

		c.register(zhangsan);
		c.register(lisi);
		c.register(wangwu);

		zhangsan.send("lisi","hello");
		lisi.send("wangwu","world");
		wangwu.send("zhangsan","hello world");

	}
}

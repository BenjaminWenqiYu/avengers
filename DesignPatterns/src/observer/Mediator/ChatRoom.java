package observer.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体的中介者--聊天室
 */
public class ChatRoom implements IChatRoom {

	private Map<String,Participant> pMap = new HashMap<String,Participant>();

	@Override
	public void register(Participant participant) {
		if(null == pMap.get(participant.getName()) ) {
			pMap.put(participant.getName(),participant);
		}
		participant.setChatRoom(this);
	}

	@Override
	public void send(String from, String to, String msg) {
		Participant participant = pMap.get(to);
		if(null != participant) {
			participant.receive(from,msg);
		}
	}
}

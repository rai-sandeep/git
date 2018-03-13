package org.exp.springboot.message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	private List<Message> messages = new ArrayList<Message>(Arrays.asList(
			new Message("1111","Simple","Hello"),
			new Message("2222","Funky","Funky hello"),
			new Message("3333","Complicated","Complicated hello"),
			new Message("4444","Special","Hello sunshine :)")));

	public List<Message> getAllMessages() {
		return messages;
	}
	
	public Message getMessage(String id) {
		return messages.stream().filter(m -> m.getId().equals(id)).findFirst().get();
	}
	
	public void addMessage(Message message) {
		messages.add(message);
	}
	
	public void updateMessage(String id, Message message) {
		for (int i=0; i < messages.size(); i++) {
			if (messages.get(i).getId().equals(id)) {
				messages.set(i, message);
				return;
			}
		}
	}
	
	public void deleteMessage(String id) {
		messages.removeIf(m -> m.getId().equals(id));
	}
}

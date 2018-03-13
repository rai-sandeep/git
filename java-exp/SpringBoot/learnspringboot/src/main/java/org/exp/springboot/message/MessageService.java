package org.exp.springboot.message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepository;

	public List<Message> getAllMessages() {
		List<Message> messages = new ArrayList<>();
		messageRepository.findAll().forEach(messages::add);
		return messages;
	}
	
	public Message getMessage(String id) {
		return messageRepository.findById(id).get();
	}
	
	public void addMessage(Message message) {
		messageRepository.save(message);
	}
	
	public void updateMessage(Message message) {
		messageRepository.save(message);
	}
	
	public void deleteMessage(String id) {
		messageRepository.deleteById(id);
	}
}

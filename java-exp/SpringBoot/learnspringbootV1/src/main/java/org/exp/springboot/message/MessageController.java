package org.exp.springboot.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired
	private MessageService messageService;

	@RequestMapping
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}
	
	@RequestMapping("/{id}")
	public Message getMessage (@PathVariable String id) {
		return messageService.getMessage(id);
	}
	
	@RequestMapping(method=RequestMethod.POST) 
	public void addMessage(@RequestBody Message message) {
		messageService.addMessage(message);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}") 
	public void updateMessage(@PathVariable String id, @RequestBody Message message) {
		messageService.updateMessage(id, message);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteMessage (@PathVariable String id) {
		messageService.deleteMessage(id);
	}
	
	@ExceptionHandler(Exception.class)
	public String handleError() {
		return "Oops! Something went wrong...";
	}
	
}

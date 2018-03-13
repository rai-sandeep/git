package org.exp.springboot.message;

public class Message {

	private String id;
	private String type;
	private String text;
	
	public Message(String id, String type, String text) {
		super();
		this.id = id;
		this.type = type;
		this.text = text;
	}
	
	public Message() {
		super();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}

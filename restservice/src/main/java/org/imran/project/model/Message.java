package org.imran.project.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Message {
	
	private Long id;
	private String messageContent;
	private String messageAuthor;
	private Date creationDate;
	
	
	public Message() {
	
	}
	public Message(Long id, String messageContent, String messageAuthor) {
		this.id = id;
		this.messageContent = messageContent;
		this.messageAuthor = messageAuthor;
		this.creationDate=new Date();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getMessageAuthor() {
		return messageAuthor;
	}
	public void setMessageAuthor(String messageAuthor) {
		this.messageAuthor = messageAuthor;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}

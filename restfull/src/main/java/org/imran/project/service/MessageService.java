package org.imran.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.imran.project.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages()
	{
		List<Message> allMessage=new ArrayList<>();
		Message mes1=new Message(1L, "Hello, how r u", "imran");
		Message mes2=new Message(2L, "what about u", "imran");
		allMessage.add(mes1);
		allMessage.add(mes2);
		return allMessage;
	}

}

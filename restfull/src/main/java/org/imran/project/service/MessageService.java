package org.imran.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.imran.project.database.Database;
import org.imran.project.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages=Database.getMessage();
	
   public MessageService() 
   {
     messages.put(1L, new Message((long) 1, "Hello, how r u", "imran"));
     messages.put(2L, new Message((long) 2, "Hello, i am fine and you", "imran"));
   }
	
	public List<Message> getAllMessages()
	{
	/*	List<Message> allMessage=new ArrayList<>();
		Message mes1=new Message(1L, "Hello, how r u", "imran");
		Message mes2=new Message(2L, "what about u", "imran");
		allMessage.add(mes1);
		allMessage.add(mes2);*/
		return new ArrayList<Message>(messages.values());
	}

	public Message getOneMessage(Long id)
	{
     return  messages.get(id);
	}
	public Message addMessage(Message message)
	{
	 message.setId((long) (messages.size()+1));
	 messages.put(message.getId(),message);
	 return message;
	}
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(),message);
		return message;
	}
	public Message deleteMessage(Long id)
	{
	  return messages.remove(id);
	}
}

package com.example.restservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.imran.project.model.Message;
import org.imran.project.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("resource")
public class MessageResource {
	MessageService messageService=new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message>  getAllMessages(@QueryParam("year")int year,
    		@QueryParam("start")int start,@QueryParam("offset")int offset) {
    	if(year>0)
		{
		return	messageService.getFilteredMessageByYear(year);
		}
		if(start>=0 && offset>0)
		{
		return messageService.getPeginationMessageByStartOffset(start, offset);
		}
        return messageService.getAllMessages();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message  addOneMessage(Message message) {
    	
        return messageService.addMessage(message);
    }

    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateOneMessage(@PathParam("messageId") Long messageId, Message message)
    {
    	message.setId(messageId);
    	return messageService.updateMessage(message);
    }
    
    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("messageId") Long messageId)
    {
    	messageService.deleteMessage(messageId);
    }
    @GET
    @Path("/{test}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message  getOneMessage(@PathParam("test") Long id) {
        return messageService.getOneMessage(id);
    } 
}

package org.imran.project.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.imran.project.model.Message;
import org.imran.project.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/resource")
public class MessageResource {
	MessageService messageService=new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message>  getAllMessages() {
        return messageService.getAllMessages();
    }
    @GET
    @Path("/{test}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message  getOneMessage(@PathParam("test") Long id) {
    	System.out.println(messageService.getOneMessage(id).getMessageAuthor());
    	System.out.println(messageService.getOneMessage(id).getMessageContent());
    	System.out.println(messageService.getOneMessage(id).getCreationDate());
    	
        return messageService.getOneMessage(id);
    } 
}

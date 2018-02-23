package org.imran.project.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.imran.project.model.Profile;
import org.imran.project.service.ProfileService;

@Path("/profile")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
		ProfileService profileService=new ProfileService();

	    @GET
	    public List<Profile>  getAllMessages() {
	        return profileService.getAllProfile();
	    }
	    
	    @POST
	    public Profile  addOneMessage(Profile profile) {
	    	
	        return profileService.addOneProfile(profile);
	    }

	    @PUT
	    @Path("/{prfileName}")
	    public Profile updateOneMessage(@PathParam("profileName") String profileName, Profile profile)
	    {
	        profile.setProfileName(profileName);
	    	return profileService.updateOneProfile(profile);
	    }
	    
	    @DELETE
	    @Path("/{profileName}")
	    public void deleteMessage(@PathParam("profileName") String profileName)
	    {
	    	profileService.deleteProfile(profileName);
	    }
	    @GET
	    @Path("/{profileNane}")
	    public Profile  getOneMessage(@PathParam("profileNane") String profileName) {
	        return profileService.getOneProfile(profileName);
	    } 

}

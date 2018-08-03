package com.example.restservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("injectparam")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectParam {
	
	@GET
	public String  injectMethod(@MatrixParam("matrix")String matrix,@HeaderParam("customheader")String customheader,@CookieParam("JSESSIONID")String JSESSIONID)
	{
	return "Matrix value "+matrix+" Header Param "+customheader+" Cookie Param "+JSESSIONID;	
	}
    @GET
	@Path("/context")
	public String contextMethod(@Context UriInfo info,@Context HttpHeaders headers)
	{
	  return "Absolute Path "+ info.getAbsolutePath().toString()+" Headers "+headers.hashCode()+" -- "+headers.getCookies();
	}
	
}

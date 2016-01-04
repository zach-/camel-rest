package com.tsa.puridiom.jms;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.cxf.jaxrs.impl.ResponseBuilderImpl;
import org.apache.cxf.jaxrs.impl.ResponseImpl;

import com.tsa.puridiom.cm.message.ServiceData;

	/**
	 * @author Zach Bricker
	 */

public class RestService {

	@POST @Path("/rest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response post(ServiceData serviceData) {
	    return null;
	}
	
	@GET @Path("/rest/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") String id) {
	    return null;
	}
	
	@DELETE @Path("/rest/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") String id) {
	    return null;
	}
	
	@PUT @Path("/rest/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response put(ServiceData serviceData , @PathParam("id") String id ) {
	    return null;
	}
	
	
}

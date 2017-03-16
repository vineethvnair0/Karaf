package com.karaf.rest.auth;

import org.apache.shiro.authz.annotation.RequiresAuthentication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by vineethn on 3/15/2017.
 */
@Path("shiro")
@RequiresAuthentication
public interface ShiroRestService {
    @GET
    @Path("hello/{name}")
    public String handleGet(@PathParam("name") String name);
}

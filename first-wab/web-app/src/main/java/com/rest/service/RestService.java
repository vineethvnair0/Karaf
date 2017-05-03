package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by vineethn on 3/17/2017.
 */
@Path("shiro")
public interface RestService {
    @GET
    @Path("hello/{name}")
    public String handleGet(@PathParam("name") String name);
}

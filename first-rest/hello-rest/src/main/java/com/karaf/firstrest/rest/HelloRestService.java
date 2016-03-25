package com.karaf.firstrest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by vineethn on 3/25/2016.
 */
@Path("say")
public interface HelloRestService {

    @GET
    @Path("hello/{name}") //Maps for the `hello/John` in the URL
    public String handleGet(@PathParam("name") String name);

}

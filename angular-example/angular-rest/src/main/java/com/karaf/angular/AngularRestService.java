package com.karaf.angular;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by vineethn on 4/5/2016.
 */
@Path("person")
@Produces(MediaType.TEXT_PLAIN)
public interface AngularRestService {

    @GET
    public String getPerson();
}

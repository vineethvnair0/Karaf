package com.rest.service.impl;

import com.rest.service.RestService;

import javax.ws.rs.PathParam;

/**
 * Created by vineethn on 3/17/2017.
 */
public class RestServiceImpl implements RestService {

    public String handleGet(@PathParam("name") String name) {
        return "Hello " +name;
    }
}

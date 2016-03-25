package com.karaf.firstrest.rest.impl;

import com.karaf.firstrest.hello.service.HelloService;
import com.karaf.firstrest.rest.HelloRestService;

/**
 * Created by vineethn on 3/25/2016.
 */
public class HelloRestServiceImpl implements HelloRestService {

    private HelloService helloService;
    @Override
    public String handleGet(String name) {

        return  helloService.sayHello(name);
    }

    public HelloRestServiceImpl(){

    }

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}

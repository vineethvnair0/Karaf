package com.karaf.firstrest.hello.service.impl;

import com.karaf.firstrest.hello.service.HelloService;

/**
 * Created by vineethn on 3/25/2016.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " +name;
    }
}

package com.karaf.shiro.auth.service.impl;

import com.karaf.shiro.auth.service.ShiroService;

/**
 * Created by vineethn on 3/15/2017.
 */
public class ShiroServiceImpl implements ShiroService {
    @Override
    public String sayHello(String name) {
        return "Hello " +name;
    }
}

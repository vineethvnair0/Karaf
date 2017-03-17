package com.karaf.rest.auth.impl;

import com.karaf.rest.auth.ShiroRestService;
import com.karaf.shiro.auth.service.ShiroService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;

/**
 * Created by vineethn on 3/15/2017.
 */
@RequiresAuthentication
public class ShiroRestServiceImpl implements ShiroRestService {

    private ShiroService shiroService;

    @Override
    public String handleGet(String name) {

        return  shiroService.sayHello(name);
    }

    public ShiroRestServiceImpl(){

    }

    public ShiroService getShiroService() {
        return shiroService;
    }

    public void setShiroService(ShiroService shiroService) {
        this.shiroService = shiroService;
    }
}

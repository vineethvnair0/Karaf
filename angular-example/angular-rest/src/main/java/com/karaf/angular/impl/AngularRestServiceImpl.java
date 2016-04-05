package com.karaf.angular.impl;

import com.karaf.angular.AngularRestService;

/**
 * Created by vineethn on 4/5/2016.
 */
public class AngularRestServiceImpl implements AngularRestService {
    public String getPerson() {
        return "This is a test message from rest";
    }
}

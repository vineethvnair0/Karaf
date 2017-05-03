package com.karaf.rest.auth.auth;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import static org.apache.syncope.common.lib.report.ReconciliationReportletConf.Feature.username;

/**
 * Created by vineethn on 4/4/2017.
 */
public class MyRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken userPassToken = (UsernamePasswordToken) authenticationToken;
        String userName = userPassToken.getUsername();
        AuthenticationInfo info = null;
        if(userName.equals("admin")) {
            info = new SimpleAuthenticationInfo("admin", "admin1", "");
        }
        return info;
    }

}

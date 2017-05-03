package com.karaf.rest.auth.auth;


import org.apache.cxf.common.util.Base64Exception;
import org.apache.cxf.common.util.Base64Utility;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.Ini;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by vineethn on 4/4/2017.
 */
public class ShiroAuthenticationFilter implements ContainerRequestFilter  {

    public DefaultSecurityManager getSecurityManager() {
        return securityManager;
    }

    public void setSecurityManager(DefaultSecurityManager securityManager) {
        this.securityManager = securityManager;
    }

    private DefaultSecurityManager securityManager;

    public void init_method (){
        Ini ini = new Ini();
        ini.addSection("users");
        ini.getSection("users").put("admin","admin1");
        ini.addSection("urls");
        ini.getSection("urls").put("/**","noSessionCreation, authcBasic");
        SecurityUtils.setSecurityManager(securityManager);
    }
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {

        String authorization = containerRequestContext.getHeaderString("Authorization");
        if(null == authorization){
            containerRequestContext.abortWith(createFaultResponse());
            return;
        }
        String[] parts = authorization.split(" ");
        if (parts.length != 2 || !"Basic".equals(parts[0])) {
            containerRequestContext.abortWith(createFaultResponse());
            return;
        }

        String decodedValue = null;
        try {
            decodedValue = new String(Base64Utility.decode(parts[1]));
        } catch (Base64Exception ex) {
            containerRequestContext.abortWith(createFaultResponse());
            return;
        }

        String[] namePassword = decodedValue.split(":");
        UsernamePasswordToken usernameToken = new UsernamePasswordToken(namePassword[0],namePassword[1]);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(usernameToken);
        }catch (Exception e){
            System.out.println("exception : "+e);
            createFaultResponse();
        }

        System.out.println("hello");
    }

    private Response createFaultResponse() {
        return Response.status(401).header("WWW-Authenticate", "Basic realm=\"axs\"").build();
    }
}

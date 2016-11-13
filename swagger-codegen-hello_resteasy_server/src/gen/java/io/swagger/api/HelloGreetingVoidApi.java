package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.HelloGreetingVoidApiService;
import io.swagger.api.factories.HelloGreetingVoidApiServiceFactory;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/helloGreetingVoid")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-11T15:09:03.656+01:00")
public class HelloGreetingVoidApi  {
   private final HelloGreetingVoidApiService delegate = HelloGreetingVoidApiServiceFactory.getHelloGreetingVoidApi();

    @GET
    
    
    
    public Response sayHelloVoid( @QueryParam("name") String name, @QueryParam("firstName") String firstName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sayHelloVoid(name,firstName,securityContext);
    }
}

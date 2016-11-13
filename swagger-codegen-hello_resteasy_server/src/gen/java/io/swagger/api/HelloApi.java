package io.swagger.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.api.factories.HelloApiServiceFactory;

@Api(value = "/", description = "")
@Path("/hello")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-11T15:09:03.656+01:00")
public class HelloApi  {
   private final HelloApiService delegate = HelloApiServiceFactory.getHelloApi();

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    // @ApiOperation("sayHello")
    public Response sayHello( @QueryParam("name") String name, @QueryParam("firstName") String firstName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sayHello(name,firstName,securityContext);
    }
}

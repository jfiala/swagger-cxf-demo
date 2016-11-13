package io.swagger.api;

import io.swagger.model.HelloModel;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/helloGreeting")

@Api(description = "the helloGreeting API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-11-09T21:53:05.425+01:00")

public class HelloGreetingApi  {

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = HelloModel.class, tags={ "hello" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = HelloModel.class) })
    public Response sayHelloWithModel(@QueryParam("name") String name,@QueryParam("firstName") String firstName) {
    	return Response.ok().entity("magic!").build();
    }
}


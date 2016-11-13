package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/helloGreetingVoid")

@Api(description = "the helloGreetingVoid API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-11-09T21:53:05.425+01:00")

public class HelloGreetingVoidApi  {

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = void.class, tags={ "hello" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = void.class) })
    public Response sayHelloVoid(@QueryParam("name") String name,@QueryParam("firstName") String firstName) {
    	return Response.ok().entity("magic!").build();
    }
}


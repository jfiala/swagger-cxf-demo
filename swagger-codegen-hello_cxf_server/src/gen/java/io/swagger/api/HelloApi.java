package io.swagger.api;

import io.swagger.model.HelloModel;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.constraints.*;

@Path("/")
@Api(value = "/", description = "")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface HelloApi  {

    @GET
    @Path("/hello")
    
    
    @ApiOperation(value = "", tags={ "hello",  })
    public String  sayHello(@QueryParam("name")  @NotNull
  @Size(min=0,max=255)
String name, @QueryParam("firstName")  @NotNull
  @Size(min=0,max=255)
String firstName);

    @GET
    @Path("/helloGreeting")
    
    
    @ApiOperation(value = "", tags={ "hello" })
    public HelloModel  sayHelloWithModel(@QueryParam("name")  @NotNull
  @Size(min=1,max=255)
String name, @QueryParam("firstName")  @NotNull
  @Size(min=0,max=255)
String firstName);
}


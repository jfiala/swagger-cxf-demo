package io.swagger.api;

import io.swagger.model.HelloModel;
import java.io.File;

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
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.*;

@Path("/")
@Api(value = "/", description = "")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface HelloApi  {

    @POST
    @Path("/helloRequest")
    @ApiOperation(value = "helloRequest", tags={ "hello",  })
    public HelloModel  helloRequest(@QueryParam("name") @NotNull @Size(min=1,max=255) String name, HelloModel body);

    @GET
    @Path("/hello")
    @ApiOperation(value = "", tags={ "hello",  })
    public String  sayHello(@QueryParam("name") @NotNull @Size(min=0,max=255) String name, @QueryParam("firstName") @NotNull @Size(min=0,max=255) String firstName);

    @GET
    @Path("/helloGreeting")
    @ApiOperation(value = "", tags={ "hello",  })
    public HelloModel  sayHelloWithModel(@QueryParam("name") @NotNull @Size(min=1,max=255) String name, @QueryParam("firstName") @NotNull @Size(min=0,max=255) String firstName);

    @POST
    @Path("/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "uploads an image", tags={ "hello" })
    public String  uploadFile(@QueryParam("name") @NotNull @Size(min=1,max=255) String name,  @Multipart(value = "file" , required = false) Attachment fileDetail);
}


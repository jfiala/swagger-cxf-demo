package io.swagger.api;

import io.swagger.model.ExtendedHelloModel;
import java.io.File;
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
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/")
@Api(value = "/", description = "")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface HelloApi  {

    @POST
    @Path("/helloRequest")
    @ApiOperation(value = "helloRequest", tags={ "hello",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = HelloModel.class) })
    public HelloModel helloRequest(@QueryParam("name") @NotNull @Size(min=1,max=255) String name, @Valid ExtendedHelloModel body);

    @GET
    @Path("/hello")
    @ApiOperation(value = "", tags={ "hello",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    public String sayHello(@QueryParam("name") @NotNull @Size(min=1,max=255) String name, @QueryParam("firstName") @NotNull @Size(min=1,max=255) String firstName);

    @GET
    @Path("/helloGreeting")
    @ApiOperation(value = "", tags={ "hello",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = HelloModel.class) })
    public HelloModel sayHelloWithModel(@QueryParam("name") @NotNull @Size(min=1,max=255) String name, @QueryParam("firstName") @NotNull @Size(min=1,max=255) String firstName);

    @POST
    @Path("/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "uploads an image", tags={ "hello" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    public String uploadFile(@QueryParam("name") @NotNull @Size(min=1,max=255) String name,  @Multipart(value = "file" , required = false) Attachment fileDetail);
}


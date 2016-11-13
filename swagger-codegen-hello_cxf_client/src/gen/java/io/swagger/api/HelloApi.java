package io.swagger.api;

import java.io.InputStream;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.model.HelloModel;

@Path("/")
@Api(value = "/", description = "")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface HelloApi  {

    @POST
    @Path("/helloRequest")
    
    
    @ApiOperation(value = "helloRequest", tags={  })
    public HelloModel  helloRequest(@QueryParam("name")  @NotNull
  @Size(min=1,max=255)
String name, HelloModel body);

    @GET
    @Path("/hello")
    
    
    @ApiOperation(value = "", tags={  })
    public String  sayHello(@QueryParam("name")  @NotNull
  @Size(min=1,max=255)
String name, @QueryParam("firstName")  @NotNull
  @Size(min=1,max=255)
String firstName);

    @GET
    @Path("/helloGreeting")
    
    
    @ApiOperation(value = "", tags={  })
    public HelloModel  sayHelloWithModel(@QueryParam("name")  @NotNull
  @Size(min=1,max=255)
String name, @QueryParam("firstName")  @NotNull
  @Size(min=1,max=255)
String firstName);

    @POST
    @Path("/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "uploads an image", tags={  })
    public String  uploadFile(@QueryParam("name")  @NotNull
  @Size(min=1,max=255)
String name,  @Multipart(value = "file", required = false) InputStream fileInputStream,
   @Multipart(value = "file" , required = false) Attachment fileDetail);
}


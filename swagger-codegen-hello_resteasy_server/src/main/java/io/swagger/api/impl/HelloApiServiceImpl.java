package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-11T15:09:03.656+01:00")
public class HelloApiServiceImpl extends HelloApiService {
      @Override
      public Response sayHello(String name,String firstName,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
        System.out.println("hello world " + name);
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}

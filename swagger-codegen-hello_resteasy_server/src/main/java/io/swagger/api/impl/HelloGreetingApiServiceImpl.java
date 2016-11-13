package io.swagger.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.api.HelloGreetingApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.HelloModel;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-11T15:09:03.656+01:00")
public class HelloGreetingApiServiceImpl extends HelloGreetingApiService {
      @Override
    public HelloModel sayHelloWithModel(String name, String firstName, SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
        HelloModel model = new HelloModel();
        model.setName(name);
        model.setFirstName(firstName);
        model.setGreeting("hello " + firstName + " " + name);

        return model;
  }
}

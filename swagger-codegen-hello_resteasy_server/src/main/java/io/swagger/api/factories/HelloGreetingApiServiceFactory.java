package io.swagger.api.factories;

import io.swagger.api.HelloGreetingApiService;
import io.swagger.api.impl.HelloGreetingApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-11T15:09:03.656+01:00")
public class HelloGreetingApiServiceFactory {

   private final static HelloGreetingApiService service = new HelloGreetingApiServiceImpl();

   public static HelloGreetingApiService getHelloGreetingApi()
   {
      return service;
   }
}

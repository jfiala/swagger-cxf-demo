package io.swagger.api.factories;

import io.swagger.api.HelloGreetingVoidApiService;
import io.swagger.api.impl.HelloGreetingVoidApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-11T15:09:03.656+01:00")
public class HelloGreetingVoidApiServiceFactory {

   private final static HelloGreetingVoidApiService service = new HelloGreetingVoidApiServiceImpl();

   public static HelloGreetingVoidApiService getHelloGreetingVoidApi()
   {
      return service;
   }
}

package io.swagger.api.factories;

import io.swagger.api.HelloApiService;
import io.swagger.api.impl.HelloApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-11-11T15:09:03.656+01:00")
public class HelloApiServiceFactory {

   private final static HelloApiService service = new HelloApiServiceImpl();

   public static HelloApiService getHelloApi()
   {
      return service;
   }
}

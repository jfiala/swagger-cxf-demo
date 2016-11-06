package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.HelloModel;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class HelloApiServiceImpl implements HelloApi {
    public String  sayHello(String name, String firstName) {
        
        return "hello " + firstName + " " +name;
    }
    
    public HelloModel  sayHelloWithModel(String name, String firstName) {
        HelloModel model = new HelloModel();
        model.setName(name);
        model.setGreeting("hello " + firstName + " " +name);
        model.setFirstName(firstName);
        return model;
    }
    
}


package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.HelloModel;
import java.io.File;

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
    public HelloModel  helloRequest(String name, HelloModel body) {
        HelloModel model = new HelloModel();
        model.setName(body.getName());
        model.setFirstName(body.getFirstName());
        model.setGreeting("hello " + body.getFirstName() + " " + body.getName());
        return model;
    }
    
    public String  sayHello(String name, String firstName) {
        return "hello " + firstName + " " + name;
    }
    
    public HelloModel  sayHelloWithModel(String name, String firstName) {
        HelloModel model = new HelloModel();
        model.setName(name);
        model.setFirstName(firstName);
        model.setGreeting("hello " + firstName + " " + name);
        return model;
    }
    
    public String uploadFile(String name, Attachment fileDetail) {
        return fileDetail.getDataHandler().getName();
    }
    
}


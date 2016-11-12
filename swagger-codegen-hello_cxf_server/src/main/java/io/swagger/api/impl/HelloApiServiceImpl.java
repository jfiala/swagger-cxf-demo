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
        return model;
    }
    
    public String  sayHello(String name, String firstName) {
        // TODO: Implement...
        
        return null;
    }
    
    public HelloModel  sayHelloWithModel(String name, String firstName) {
        // TODO: Implement...
        
        return null;
    }
    
    public void  uploadFile(String name,  Attachment fileDetail) {
        // TODO: Implement...
        
        
    }
    
}


package io.swagger.api.impl;

import io.swagger.annotations.*;
import io.swagger.api.HelloApi;
import io.swagger.api.HelloGreetingApi;
import io.swagger.api.HelloGreetingVoidApi;
import io.swagger.model.HelloModel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-11T14:27:55.660+01:00")

@Controller
public class HelloApiController implements HelloApi, HelloGreetingApi, HelloGreetingVoidApi {

    public ResponseEntity<String> sayHello(
            @ApiParam(value = "", required = true) @RequestParam(value = "name", required = true) String name,
            @ApiParam(value = "", required = true) @RequestParam(value = "firstName", required = true) String firstName) {
        // do some magic!
        return ResponseEntity.ok("hello " + firstName + " " + name);
    }

    public ResponseEntity<HelloModel> sayHelloWithModel(
            @ApiParam(value = "", required = true) @RequestParam(value = "name", required = true) String name,
            @ApiParam(value = "", required = true) @RequestParam(value = "firstName", required = true) String firstName) {

        HelloModel model = new HelloModel();
        model.setName(name);
        model.setGreeting("hello " + firstName + " " + name);
        model.setFirstName(firstName);

        // do some magic!
        ResponseEntity<HelloModel> entity = ResponseEntity.ok(model);
        return entity;
    }

    public ResponseEntity<Void> sayHelloVoid(
            @ApiParam(value = "", required = true) @RequestParam(value = "name", required = true) String name,
            @ApiParam(value = "", required = true) @RequestParam(value = "firstName", required = true) String firstName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

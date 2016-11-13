package io.swagger.api;

import io.swagger.model.HelloModel;

import io.swagger.annotations.*;

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
public class HelloGreetingApiController implements HelloGreetingApi {

    public ResponseEntity<HelloModel> sayHelloWithModel(@ApiParam(value = "", required = true) @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "", required = true) @RequestParam(value = "firstName", required = true) String firstName) {
        // do some magic!
        HelloModel model = new HelloModel();
        model.setName(name);
        model.setGreeting("hello " + firstName + " " + name);
        model.setFirstName(firstName);

        // do some magic!
        ResponseEntity<HelloModel> entity = ResponseEntity.ok(model);
        return entity;
    }

}

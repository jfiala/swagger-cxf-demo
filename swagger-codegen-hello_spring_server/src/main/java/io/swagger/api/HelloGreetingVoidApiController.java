package io.swagger.api;


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
public class HelloGreetingVoidApiController implements HelloGreetingVoidApi {

    public ResponseEntity<Void> sayHelloVoid(@ApiParam(value = "", required = true) @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "", required = true) @RequestParam(value = "firstName", required = true) String firstName) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

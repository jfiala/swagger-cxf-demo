package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-11T14:27:55.660+01:00")

@Api(value = "helloGreetingVoid", description = "the helloGreetingVoid API")
public interface HelloGreetingVoidApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "hello", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    @RequestMapping(value = "/helloGreetingVoid",
        method = RequestMethod.GET)
    ResponseEntity<Void> sayHelloVoid(@ApiParam(value = "", required = true) @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "", required = true) @RequestParam(value = "firstName", required = true) String firstName);

}

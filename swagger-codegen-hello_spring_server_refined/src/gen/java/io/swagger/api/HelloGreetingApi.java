package io.swagger.api;

import io.swagger.model.HelloModel;

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

@Api(value = "helloGreeting", description = "the helloGreeting API")
public interface HelloGreetingApi {

    @ApiOperation(value = "", notes = "", response = HelloModel.class, tags={ "hello", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = HelloModel.class) })
    @RequestMapping(value = "/helloGreeting",
        method = RequestMethod.GET)
    ResponseEntity<HelloModel> sayHelloWithModel(@ApiParam(value = "", required = true) @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "", required = true) @RequestParam(value = "firstName", required = true) String firstName);

}

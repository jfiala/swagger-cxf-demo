/*
 * Sample REST Application
 * The Application
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.junit.Test;

import io.swagger.client.ApiException;

/**
 * API tests for HelloApi
 */
public class HelloApiTest {
	/**
	* Logger for this class
	*/
	private static final Logger log = Logger.getLogger(HelloApiTest.class.getName());
	

    private final HelloApi api = new HelloApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sayHelloTest() throws ApiException {
    	api.getApiClient().setBasePath("http://localhost:8180/swagger-cxf-server/rest/services");
        String name = "test";
        String response = api.sayHello(name, "test");
        assertNotNull(response);
        System.out.println("response: " + response);
        log.info("response: " +response);
        // TODO: test validations
    }
    
}
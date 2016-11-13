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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.executable.ExecutableValidator;

import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.BeanValidationException;

/**
 * API tests for HelloApi
 */
public class HelloApiBeanValidationTest {
	/**
	* Logger for this class
	*/
	private static final Logger log = Logger.getLogger(HelloApiBeanValidationTest.class.getName());
	

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
        try {
            // api.getApiClient().setBasePath("http://localhost:8180/swagger-cxf-server/rest/services");
            api.getApiClient().setBasePath("http://localhost:8080/services");
            String name = null;
            String firstName = "";
            String response = api.sayHello(name, firstName);
            fail("validation error has to be thrown");
        } catch (BeanValidationException e) {
            e.printStackTrace();

            assertEquals(2, e.getViolations().size());
            Set<ConstraintViolation<Object>> violations = e.getViolations();
            Iterator<ConstraintViolation<Object>> it = violations.iterator();
            Class<? extends Annotation> constraintType = it.next().getConstraintDescriptor()
                    .getAnnotation().annotationType();
            assertEquals(NotNull.class, constraintType);
            constraintType = it.next().getConstraintDescriptor().getAnnotation()
                    .annotationType();
            assertEquals(Size.class, constraintType);
        }
    }
    
    @Test
    public void sayHelloValidationTest() throws ApiException, NoSuchMethodException, SecurityException {
        // api.getApiClient().setBasePath("http://localhost:8180/swagger-cxf-server/rest/services");
        api.getApiClient().setBasePath("http://localhost:8080/services");
        String name = null;
        String firstName = "";

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        ExecutableValidator executableValidator = factory.getValidator().forExecutables();

        String[] parameterValues = { name, firstName };
        Method method = api.getClass().getMethod("sayHelloWithHttpInfo", String.class, String.class);
        Set<ConstraintViolation<Object>> violations = executableValidator.validateParameters(api, method,
                parameterValues);

        assertEquals(2, violations.size());

        Iterator<ConstraintViolation<Object>> it = violations.iterator();
        Class<? extends Annotation> constraintType = it.next().getConstraintDescriptor().getAnnotation()
                .annotationType();
        assertEquals(Size.class, constraintType);
        constraintType = it.next().getConstraintDescriptor().getAnnotation().annotationType();
        assertEquals(NotNull.class, constraintType);


    }

}

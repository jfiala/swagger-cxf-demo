/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
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


package io.swagger.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;
import org.junit.Test;




/**
 * API tests for PetApi
 */
public class PetApiRemotePostTest {


    
    @Test
    public void uploadFileTest() throws FileNotFoundException {
        String request = "testxxx";

        Attachment attRequest = new Attachment("additionalMetadata", MediaType.APPLICATION_JSON_TYPE.toString(),
                (Object) request);

        List<Attachment> list = new ArrayList<Attachment>();
        list.add(attRequest);

        InputStream stream = new FileInputStream("c:/temp/test.txt");
        WebClient webClient = WebClient.create("http://localhost:8080/services/pet/1/uploadImage");
        // webClient.encoding("UTF-8");
        webClient.type(MediaType.MULTIPART_FORM_DATA);

        ContentDisposition cd = new ContentDisposition("attachment;filename=test.txt");
        Attachment att = new Attachment("file", stream, cd);

        list.add(att);

        MultipartBody body = new MultipartBody(list);

        Response response = webClient.post(list);
    }
    
}
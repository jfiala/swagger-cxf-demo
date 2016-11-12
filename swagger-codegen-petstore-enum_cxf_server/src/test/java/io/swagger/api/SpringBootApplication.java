package io.swagger.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:/ApplicationContext.xml"})
@EnableAutoConfiguration
public class SpringBootApplication extends SpringBootServletInitializer {
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootApplication.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
    
    
}
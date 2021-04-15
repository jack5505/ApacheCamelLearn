package com.example.test.camel.demo.api.resources;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
@Component
public class ApplicationResources extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").port(9090).host("localhost")
                .bindingMode(RestBindingMode.json);

        rest().get("/hello-world")
                .produces(MediaType.APPLICATION_JSON_VALUE)
                .route().setBody(constant("Welcome to java"));

    }
}

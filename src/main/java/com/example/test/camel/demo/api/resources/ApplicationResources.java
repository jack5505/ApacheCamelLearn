package com.example.test.camel.demo.api.resources;

import com.example.test.camel.demo.Dto;
import com.example.test.camel.demo.MyProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestOperationResponseMsgDefinition;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
@Component
public class ApplicationResources extends RouteBuilder {

    JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Dto.class);

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").port(9090).host("localhost")
                .bindingMode(RestBindingMode.json);

        rest().get("/hello-world")
                .produces(MediaType.APPLICATION_JSON_VALUE)
                .route().setBody(constant("Welcome to java"));



        rest().get("/testother").
                to("direct:getContact");


        from("direct:getContact").setHeader(Exchange.HTTP_METHOD, simple("GET"))
                .to("http://srv-bss3:8080/api/list?bridgeEndpoint=true").convertBodyTo(String.class).
                log("here we go Jack  ${body}" );





    }


}

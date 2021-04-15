package com.example.test.camel.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.web.context.annotation.ApplicationScope;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
@ApplicationScope
public class NewRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

       /* from("platform-http:/hello/camel")
                .setBody().constant("Camel runs on");*/

    }
}

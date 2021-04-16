package com.example.test.camel.demo;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */

public class MyProcessor implements org.apache.camel.Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("finnaly we are here");
        System.out.println(exchange.getIn().getBody());
    }

}

package com.example.test.camel.demo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.camel.Exchange;
import org.apache.camel.util.json.JsonObject;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Component;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */

public class MyProcessor implements org.apache.camel.Processor {

    @Override
    public void process(Exchange exchange) throws Exception {


        System.out.println(exchange.getMessage().getBody());
        System.out.println(exchange.getIn().getBody());
    }

}

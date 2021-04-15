package com.example.test.camel.demo;

// import org.apache.camel.Exchange;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
// import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
@Component
public class MyRoute extends RouteBuilder {

    // JacksonDataFormat jsonDataFormat = new JacksonDataFormat(String.class);

    public MyRoute() {
    }

    @Override
    public void configure() throws Exception {

       /* from("timer:foo?period=20")
                .to("https://olx-uz.live/")
                .log("Hello world");//.process(new MyProcessor());*/

        /*from("file://Users/ofb-mac/BSS/ALGORITMS/learn?noop=true").process(new CreateEmployerProcessoer())
                .marshal(jsonDataFormat)
                .setHeader(Exchange.HTTP_METHOD,simple("POST"))
                .setHeader(Exchange.CONTENT_TYPE,constant("application/json"))
                .to("http://10.10.110.47:8080/SvGateClient/sender")
                .process(new MyProcessor()); */
/*       from("file://Users/ofb-mac/BSS/ALGORITMS/learn?noop=true").setHeader(Exchange.HTTP_METHOD,simple("GET"))
                .to("jetty:http://10.10.120.122:9090/api/v1/auth/tokens").process(new MyProcessor());
                */

       /* from("jetty://http//localhost:8081/myapp")
                .setHeader(Exchange.HTTP_METHOD,simple("GET"))
                //.to("other")
                .process(new MyProcessor());
                */




     /*  from("direct:start").setHeader(Exchange.HTTP_METHOD,simple("GET"))
                .to("http://10.10.120.122:9090/api/v1/auth/tokens")
                .process(new MyProcessor()); */



     /* from("jetty:http://localhost:8080/myapp")
              .to("jetty:http:10.10.120.122:9090/api/v1/auth/tokens");
              */








    }
}

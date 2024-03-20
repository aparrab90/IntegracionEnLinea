package org.apache.camel.learn;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouter  extends RouteBuilder{
    public void configure()throws Exception{
        from("direct:saludo")
        .routeId("SaludosRoute")
        .transform()
        .method("MiBean","mayusculas")
        .log("log:Salida")
        .end()
        .to("stream:out");
    }
    
}

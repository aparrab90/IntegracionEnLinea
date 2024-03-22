package org.apache.camel.learn.Components;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;

@Component
public class PersonaRouter extends RouteBuilder {

    JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Persona.class);

    @Override
    public void configure() throws Exception{
        from("direct:crearPersona")
        .routeId("CrearPersona")
        .log("Antes de procesar: ${body.class} -")
        .process(new CreatePersonProcesor())
        .split().body() 
            .log("Procesando: ${body}")
            .choice()
                .when(simple("${body.formaPago} == 'canales_digitales'"))
                    .log("Canal digital. Enviando a la EMPRESA 123 pymicro:5000")
                    .marshal(jsonDataFormat)
                    .to("rest:post:/canales_digitales?host=pymicro:5000")
                .when(simple("${body.formaPago} == 'canales_presenciales'"))
                    .log("Canal presencial. Enviando a la EMPRESA ABC netmicro:80")
                    .marshal(jsonDataFormat)
                    .to("rest:post:/CanalesPresenciales?host=netmicro:80")
                .otherwise()
                    .log("Forma de pago no identificada. Se requiere revisión.")
            .end()
        .end()
        .log("Fin del procesamiento de crearPersona");
    }
    
    
}

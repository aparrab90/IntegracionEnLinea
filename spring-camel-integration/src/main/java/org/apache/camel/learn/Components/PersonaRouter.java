package org.apache.camel.learn.Components;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;

@Component
public class PersonaRouter extends RouteBuilder {

    JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Persona.class);

    


    @Override
    public void configure() throws Exception{
        /*from("direct:crearPersona")
        .routeId("CrearPersona")
        .log("Antes de procesar: ${body.class}")
        .process(new CreatePersonProcesor())
        .log("Después de procesar: ${body.class}")
        .marshal(jsonDataFormat)
        .to("rest:post:/persons?host=localhost:5000")
        .to("log:CREATE")
        .log("Tipo del cuerpo antes de acceso a formaPago: ${body.class}");*/

        from("direct:crearPersona")
        .routeId("CrearPersona")
        .log("Antes de procesar: ${body.class}")
        .process(new CreatePersonProcesor())
        .log("Después de procesar: ${body.class}")
        // Utiliza choice para tomar decisiones basadas en formaPago
        .choice()
        .when(simple("${body.formaPago} == 'digital'"))
        .log("Forma de pago es digital. Enviando a localhost:5000")
        .marshal(jsonDataFormat) // Serializa aquí porque sabes la próxima ruta
        .to("rest:post:/persons?host=localhost:5000")
        .when(simple("${body.formaPago} == 'presencial'"))
        .log("Forma de pago es presencial. Enviando a localhost:5001")
        .marshal(jsonDataFormat) // Serializa aquí porque sabes la próxima ruta
        .to("rest:post:/persons?host=localhost:5001")
        .otherwise() // Opcional: manejar casos que no cumplen las condiciones anteriores
        .log("Forma de pago no identificada. Se requiere revisión.")
        // Fin del choice
        .end()
        .to("log:CREATE")
        .log("Fin del procesamiento de crearPersona.");



        
    }
    
}

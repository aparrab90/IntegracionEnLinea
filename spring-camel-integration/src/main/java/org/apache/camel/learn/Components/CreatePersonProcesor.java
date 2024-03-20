package org.apache.camel.learn.Components;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreatePersonProcesor implements Processor{

    public void process(Exchange exchange) throws Exception{
        Persona nueva = new Persona();
        nueva.setCodigo(1);
        nueva.setIdentificacion("9");
        nueva.setNombres("Monica Bagua");
        nueva.setDireccion("Centenario Sur");
        nueva.setFormaPago("digital"); // o "presencial", según tu lógica de negocio
        exchange.getIn().setBody(nueva);


    }
    
}

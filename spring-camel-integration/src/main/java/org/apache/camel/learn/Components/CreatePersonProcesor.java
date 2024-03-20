package org.apache.camel.learn.Components;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreatePersonProcesor implements Processor{

    public void process(Exchange exchange) throws Exception{
        Persona nueva = new Persona();
        nueva.setCodigo(1);
        nueva.setIdentificacion("1234567890");
        nueva.setNombres("Carlos Parra");
        nueva.setDireccion("Secap");
        exchange.getIn().setBody(nueva);


    }
    
}

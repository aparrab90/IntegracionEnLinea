package org.apache.camel.learn.Components;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CreatePersonProcesor implements Processor{
    
    public void process(Exchange exchange) throws Exception{
        List<Persona> personas = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Persona nueva = new Persona();
            nueva.setCodigo(random.nextInt(1000)); // Genera un código aleatorio
            nueva.setIdentificacion(String.valueOf(random.nextInt(10000) + 1000)); // Genera una identificación aleatoria
            nueva.setNombres("Persona " + nueva.getCodigo()); // Nombre basado en el código
            nueva.setDireccion("Calle " + (random.nextInt(100) + 1)); // Dirección aleatoria
            String[] formasDePago = {"canales_digitales", "canales_presenciales"};
            nueva.setFormaPago(formasDePago[random.nextInt(formasDePago.length)]);
            personas.add(nueva);
        }
        exchange.getIn().setBody(personas);
    }
    
}

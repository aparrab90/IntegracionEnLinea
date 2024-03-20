package org.apache.camel.learn;

import org.springframework.stereotype.Component;

@Component("MiBean")
public class MyBean {
    public String mayusculas(String data){
        return data.toUpperCase();
    }
    
}

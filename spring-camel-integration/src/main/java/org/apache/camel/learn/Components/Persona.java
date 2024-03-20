package org.apache.camel.learn.Components;

public class Persona {
    private int codigo;
    private String identificacion;
    private String nombres;
    private String direccion;
    private String formaPago; // digital o presencial
    public Persona(int codigo, String identificacion, String nombres, String direccion, String formaPago) {
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.formaPago = formaPago;
    }
    public Persona() {
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getFormaPago() {
        return formaPago;
    }
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    @Override
    public String toString() {
        return "Persona [codigo=" + codigo + ", identificacion=" + identificacion + ", nombres=" + nombres
                + ", direccion=" + direccion + ", formaPago=" + formaPago + "]";
    }

    

    
    
}

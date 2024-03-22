
public class CanalesPresenciales
{
    public CanalesPresenciales(int codigo, string nombres, string direccion, string identificacion, string formaPago)
    {
        this.codigo = codigo;
        this.nombres = nombres;
        this.direccion = direccion;
        this.identificacion = identificacion;
        this.formaPago = formaPago;
    }

    public int codigo { get; set; }
    public string nombres { get; set; }
    public string direccion { get; set; }
    public string identificacion { get; set; }
    public string formaPago { get; set; }
    
}

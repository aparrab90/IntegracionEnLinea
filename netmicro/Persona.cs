public class Persona
{
    public Persona(int codigo, string nombres, string direccion, string identificacion)
    {
        this.codigo = codigo;
        this.nombres = nombres;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }

    public int codigo { get; set; }
    public string nombres { get; set; }
    public string direccion { get; set; }
    public string identificacion { get; set; }
}

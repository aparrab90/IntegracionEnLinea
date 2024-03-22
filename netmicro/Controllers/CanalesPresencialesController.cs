
using Microsoft.AspNetCore.Mvc;

namespace netmicro.Controllers;

[ApiController]
[Route("[controller]")]

public class CanalesPresencialesController : ControllerBase
{
    static List<CanalesPresenciales> personas = new List<CanalesPresenciales>()
    {
        new CanalesPresenciales(1, "Angel Javier Parra Bagua","Guayaquil","0928551803","canales_presenciales")
        
    };


    private readonly ILogger<CanalesPresencialesController> _logger;

    public CanalesPresencialesController(ILogger<CanalesPresencialesController> logger)
    {
        _logger = logger;
    }

    [HttpGet(Name = "GetPersona")]
    public IEnumerable<CanalesPresenciales> Get()
    {
        return personas.ToArray();
    }

    [HttpPost(Name = "CrearPersona")]
    public string Post(CanalesPresenciales persona)
    {
        personas.Add(persona);
        return "ok";
    }
}
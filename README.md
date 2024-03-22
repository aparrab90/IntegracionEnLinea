# IntegracionEnLinea
Desarrolle una solución tipo prueba de concepto, que permita realizar un escenario que simule el ambiente antes descrito, utilizando un framework de integración así como un patrón de integración que permita transmitir la información de los clientes.

# Manual de Ejecución de Servicios con Docker Compose

Este manual provee las instrucciones para levantar los servicios de microservicios utilizando Docker y `docker-compose`.

## Tecnologías

- **.NET**: Servicio web ASP.NET.
- **Python**: Aplicación web Flask.
- **Java**: Aplicación con Spring y Apache Camel.

## Prerequisitos

- Docker instalado y funcionando.
- `docker-compose` instalado.
- Clonar o tener acceso al repositorio con los archivos `Dockerfile` y `docker-compose.yml`.


## Estructura de Archivos

Cada microservicio tiene su propio `Dockerfile`:

- `./netmicro/Dockerfile`
- `./pymicro/Dockerfile`
- `./spring-camel-integration/Dockerfile`

Además, se utiliza un `docker-compose.yml` para definir y ejecutar todos los servicios.


## Instrucciones de Ejecución
``Todo esto es `código`. ``

## Docker Compose

Para iniciar los servicios, navegue al directorio donde se encuentra el archivo `docker-compose.yml` y ejecute:

``docker-compose up -d``

### Luego verifica los servicios levantados entrando a los link

Servicio de pymicro para la empresa 123
- `http://localhost:5000/canales_digitales`

Servicio de netmicro para la empresa ABC
- `http://localhost:5056/CanalesPresenciales`

Servicio de javamicro para la empresa XYZ encargado de crear a las personas o clientes y asignarlos al servicio correcto 
- `http://localhost:8080/createperson`




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

## Docker Compose

Para iniciar los servicios, navegue al directorio donde se encuentra el archivo `docker-compose.yml` y ejecute:

```bash
docker-compose up -d

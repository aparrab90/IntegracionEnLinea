# Usa una imagen base que contenga JDK 17 y Maven
FROM maven:3.8.4-openjdk-17-slim AS build

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia los archivos de configuración de Maven (pom.xml) para aprovechar el caché de dependencias
COPY pom.xml .

# Copia los archivos fuente al directorio de trabajo
COPY src ./src

# Construye la aplicación
RUN mvn package -DskpTests

# Ejecuta mvn camel:run para iniciar la aplicación Camel
CMD ["mvn", "camel:run"]

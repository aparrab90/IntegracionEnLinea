# Etapa de construcción: Usa una imagen base que contenga JDK 17 y Maven
FROM maven:3.8.4-openjdk-17-slim AS build

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia los archivos de configuración de Maven (pom.xml) para aprovechar el caché de dependencias
COPY pom.xml .

# Copia los archivos fuente al directorio de trabajo
COPY src ./src

# Construye la aplicación y omite la ejecución de pruebas
RUN mvn package -DskipTests

# Etapa de ejecución: Usa una imagen base con JRE para un contenedor más liviano
FROM openjdk:17-slim

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el JAR desde la etapa de construcción al directorio de trabajo
COPY --from=build /app/target/spring-camel-integration-1.0.0-SNAPSHOT.jar .

# Ejecuta el JAR cuando se inicie el contenedor
CMD ["java", "-jar", "spring-camel-integration-1.0.0-SNAPSHOT.jar"]

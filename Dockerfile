# Utilizar una imagen base ligera de Java 21 con Alpine para minimizar el tamaño
FROM openjdk:21-jdk-alpine

# Establecer una variable de entorno para desactivar el buffering en logs (opcional)
ENV JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom"

# Crear y establecer el directorio de trabajo de la aplicación
WORKDIR /app

# Copiar el archivo JAR generado por Maven
COPY target/premium-backend-auction-1.0-SNAPSHOT.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]

FROM openjdk:8
ADD target/gestion-kaddem-1.0.jar gestion-kaddem-1.0.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/gestion-kaddem-1.0.jar"]

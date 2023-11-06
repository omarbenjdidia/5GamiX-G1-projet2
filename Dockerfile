FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/springproject-1.0.jar springproject-1.0.jar

ENTRYPOINT ["java", "-jar","/springproject-1.0.jar"]

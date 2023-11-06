FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/springprojectt-1.0.jar springprojectt-1.0.jar

ENTRYPOINT ["java", "-jar","/springprojectt-1.0.jar"]

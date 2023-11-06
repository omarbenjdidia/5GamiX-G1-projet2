FROM openjdk:8-jdk-alpine
EXPOSE 8089

ADD target/springproject-SNAPSHOT-01.jar springproject-SNAPSHOT-01.jar
ENTRYPOINT ["java", "-jar", "/springproject-SNAPSHOT-01.jar"]

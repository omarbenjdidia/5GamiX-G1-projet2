FROM openjdk:8-jdk-alpine
EXPOSE 8089

ADD http://192.168.231.236:8081/repository/maven-snapshots/tn/esprit/spring/kaddem/0.0.1-SNAPSHOT/kaddem-0.0.1-20231103.131550-3.jar /kaddem-0.0.1-20231103.131550-3.jar
ENTRYPOINT ["java", "-jar", "/kaddem-0.0.1-20231103.131550-3.jar"]

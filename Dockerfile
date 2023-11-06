FROM openjdk:8-jdk-alpine
EXPOSE 8089

ADD http://192.168.231.236:8081/repository/maven-snapshots/tn/esprit/spring/springproject/SNAPSHOT-02/springproject-SNAPSHOT-02.jar /springproject-SNAPSHOT-02.jar
ENTRYPOINT ["java", "-jar", "/springproject-SNAPSHOT-02.jar"]

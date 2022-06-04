FROM openjdk:11-jdk
MAINTAINER NITIN JAIN
COPY target/myhelloword-k8s-0.0.1-SNAPSHOT.jar myhelloword-k8s.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "/myhelloword-k8s.jar"]
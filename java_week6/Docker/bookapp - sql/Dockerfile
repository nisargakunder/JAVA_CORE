FROM openjdk:21
EXPOSE 8080
ADD target/bookapp-0.0.1-SNAPSHOT.jar bookapp.jar
ENTRYPOINT ["java","-jar","bookapp.jar"]
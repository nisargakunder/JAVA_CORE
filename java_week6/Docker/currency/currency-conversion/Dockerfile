FROM openjdk:21
EXPOSE 8080
ADD target/currency-conversion-0.0.1-SNAPSHOT.jar currency-conversion.jar
ENTRYPOINT ["java","-jar","currency-conversion.jar"]
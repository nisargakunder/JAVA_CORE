FROM openjdk:21

EXPOSE 8100
ADD target/currency-conversion-0.0.1-SNAPSHOT.jar currency.jar
ENTRYPOINT ["java","-jar","currency.jar"]
FROM openjdk:26-ea-26-slim

ARG JAR_FILE=build/libs/ap_demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
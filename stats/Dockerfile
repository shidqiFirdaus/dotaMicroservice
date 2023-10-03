FROM eclipse-temurin:17-jdk-alpine

WORKDIR /home/

COPY ./build/libs/stats-0.0.1-SNAPSHOT.jar /home/stats.jar

ENTRYPOINT  ["java","-jar","/home/stats.jar"]




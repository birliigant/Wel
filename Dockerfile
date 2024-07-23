FROM openjdk:17-jdk-alpine

ADD target/WelGame-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 7436
ENTRYPOINT java -jar /app.jar

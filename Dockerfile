FROM openjdk:8-jre-alpine
COPY target/kubernetes-learn-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
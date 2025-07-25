FROM eclipse-temurin:17-jdk-alpine
COPY target/*.jar app.jar
COPY ./ ./
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
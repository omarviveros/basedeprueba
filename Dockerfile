
FROM amazoncorretto:17-alpine-jdk

COPY target/ app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
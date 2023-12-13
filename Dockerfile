FROM docker.io/library/openjdk:19-alpine@sha256:1686909f4ca66f3e13463e2b00a1c53808aa155f81ae9a8aad8f4b89420d91ef

WORKDIR ./

CMD ls

COPY build/libs/*.jar /app/spring-app.jar

EXPOSE 8080

CMD ["java", "-jar", "spring-app.jar"]
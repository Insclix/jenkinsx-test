FROM openjdk:8-jdk-alpine
ENV PORT 8080
EXPOSE 8080

WORKDIR /opt
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar

ARG JAR_FILE
COPY target/${JAR_FILE} /opt/app.jar
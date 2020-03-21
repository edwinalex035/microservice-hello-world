FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG ARGS_JAVA_OPTS
ADD target/*.jar app.jar
ENV JAVA_OPTS=${ARGS_JAVA_OPTS}
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
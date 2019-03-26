FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} manager-0.0.1.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/manager-0.0.1.war"]
EXPOSE 8080

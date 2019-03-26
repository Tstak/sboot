FROM openjdk:8
ADD target/manager-0.0.1.war manager-0.0.1.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/manager-0.0.1.war"]
EXPOSE 8080

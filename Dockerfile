FROM openjdk:8
ADD target/manager-1.0.0.war manager-1.0.0.war
ENTRYPOINT ["java", "-Xms512m", "-Xmx1024m", "-Djava.security.egd=file:/dev/./urandom", "-jar", "manager-1.0.0.war"]
EXPOSE 8080

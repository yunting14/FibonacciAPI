FROM openjdk:17 
EXPOSE 8080
ADD target/spring-boot-fibonacci-docker.jar spring-boot-fibonacci-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-fibonacci-docker.jar"]
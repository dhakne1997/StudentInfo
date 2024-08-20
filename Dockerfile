#FROM openjdk:17
#ADD target/springboot-docker.jar springboot-docker.jar
#ENTRYPOINT ["java","-jar","/springboot-docker.jar"]
#EXPOSE 8080


# Use a base image with OpenJDK
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Spring Boot JAR file into the container at /app
COPY target/springboot-docker.jar /app/springboot-docker.jar

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "springboot-docker.jar"]

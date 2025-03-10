# Use an official OpenJDK runtime as base image
FROM openjdk:17
# Set the working directory inside the container
WORKDIR /appBackend

# Copy the JAR file from target folder to container
COPY target/TwitterSpring-0.0.1-SNAPSHOT.jar hardware.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "hardware.jar"]

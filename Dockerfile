# Use the official OpenJDK base image
FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Add your JAR file from the local filesystem to the image
ADD ./target/kkaddem-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application will run on
EXPOSE 8089

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]




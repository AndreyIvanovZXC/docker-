FROM openjdk:17-jdk-slim
WORKDIR /app
COPY app.java /app
RUN javac app.java
EXPOSE 8082
CMD ["java", "app"]
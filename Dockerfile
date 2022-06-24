FROM gradle:7.4.2-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle shadowJar --info

FROM openjdk:11.0.15-slim
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/app/build/libs/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
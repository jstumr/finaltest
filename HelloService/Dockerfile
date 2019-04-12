FROM openjdk:8-jre-alpine
# copy application WAR (with libraries inside)
COPY target/HelloService-0.0.1-SNAPSHOT.jar hello.jar
EXPOSE 8200
# specify default command
ENTRYPOINT ["java", "-jar", "hello.jar"]
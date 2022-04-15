FROM openjdk:8
COPY ./target/MiniProj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "MiniProj-1.0-SNAPSHOT-jar-with-dependencies.jar"]

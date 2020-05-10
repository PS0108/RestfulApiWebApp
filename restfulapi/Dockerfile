FROM openjdk:8
ADD target/restfulapi-0.0.1-SNAPSHOT.jar restfulapi-0.0.1-SNAPSHOT.jar 
EXPOSE 8080
ENTRYPOINT ["java","-jar","restfulapi-0.0.1-SNAPSHOT.jar"]
COPY ./contents.json contents.json
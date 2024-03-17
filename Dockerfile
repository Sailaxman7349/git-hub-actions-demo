FROM openjdk:17
EXPOSE 8080
ADD target/docker-workflow.jar docker-workflow.jar
ENTRYPOINT [ "java","-jar","/docker-workflow.jar" ]
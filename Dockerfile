FROM java
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT echo "Welcome"
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080




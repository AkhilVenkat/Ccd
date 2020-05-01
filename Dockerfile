FROM openjdk:8
ADD target/ccdapp.jar ccdapp.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/ccdapp.jar"]
Java Coding Assignment #1: 
(Prime Factorization) 

clone project into local system by using command prompt by issuing following command:

git clone: <url>

Change currrent directory to project root directory

To run application

To clean project : mvn clean
To run test cases: mvn test
To create package: mvn install

On build success it generate jar file to run jar

>java -jar target\ccdapp.jar 48 <input>

It will show the following sample:
.....
2 x 2 x 2 x 2 x 3

Building Image:

>docker build -t springbootapp/ccdapp

Run Docker Image:

>docker run -p 9090:9090 springbootapp/ccdapp

Note: Ensure 9090 port is not used 

To access api:

http://<ip|localhost>:9090/api/48


 
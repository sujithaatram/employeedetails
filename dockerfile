FROM openjdk:17
EXPOSE 9595
ADD build/libs/EmployeeInfo-0.0.1-SNAPSHOT.jar EmployeeInfo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/EmployeeInfo-0.0.1-SNAPSHOT.jar" ]
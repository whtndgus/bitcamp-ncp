FROM openjdk:17-alpine

WORKDIR /usr/src/app

ARG JAR_PATH=./build/libs

COPY ${JAR_PATH}/demo-0.0.1-SNAPSHOT.jar ${JAR_PATH}/demo-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","./build/libs/demo-0.0.1-SNAPSHOT.jar"]
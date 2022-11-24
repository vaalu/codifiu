# obauth
obauth project

A simple auth project with the following:
- Register a mobile number with an OTP
- Register an email with an OTP
- Register mpin

The project is being developed with Quarkus. Hence maven commands will be different.
All the other spring related tech reference remains same.

## Pre-Requisites:
- Java 11 or above
- MySQL or MariaDB

## Pre-Process
- Run the script under scripts/mariadb.sql for table creation

## Application Properties
All the configurations required for the application has been kept in
```
src/main/resources/application.properties
```

## Build and Deployment
Normal maven commands can be used to do a build:
```
mvn clean install
``` 
For running locally, run with following command:
```
mvnw quarkus:dev 
```
## API Documentation / Swagger Documentation
Once the application is run, access the swagger api documentation in the following url:
```
http://localhost:9000/q/swagger-ui/
```
# obauth Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/obauth-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- REST Client Classic ([guide](https://quarkus.io/guides/rest-client)): Call REST services
- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing JAX-RS and more

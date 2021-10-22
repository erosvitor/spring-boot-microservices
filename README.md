## About
The project shows how to build microservice application using Spring Boot.

## Technologies
The following tools were used in this project:

* [Java Oracle](https://www.oracle.com/java/)
* [Apache Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
* [Spring Cloud Netflix Eureka](https://spring.io/projects/spring-cloud-netflix)
* [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
* [Spring Tools Suite](https://spring.io/tools)

## Requirements
Before starting this project you need to have Git, JDK Oracle, Maven and STS installed.

## Starting the project

### Clonning the project
```
$ git clone https://github.com/erosvitor/spring-boot-microservices.git

$ cd spring-boot-microservices
```

### Testing the project
**Step 1:** Start the application using Spring Tools Suite.
* eurekaserver
* gatewayserver
* employee
* payslip
* payroll

**Step 2:** Check the services in Eureka dashboard

```
http://localhost:8761
```

**Step 3:** Insert an employee

```
curl --location --request POST 'http://localhost:8888/employee' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Fulano da Silva",
    "email": "fulano@yahoo.com.br",
    "salary": 3000.00
}'
```

**Step 4:** Generate payroll

```
curl --location --request GET 'http://localhost:8888/payroll'
```

## License
This project is under license from MIT. For more details, see the LICENSE file.

## Release History
* 1.0.0 (2021-10-20)
    * First version

## About
The project shows how to build microservice application using Spring Boot.

## Technologies
The following technologies were used in this project:

* [Java Oracle](https://www.oracle.com/java/)
* [Apache Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
* [Spring Cloud Netflix Eureka](https://spring.io/projects/spring-cloud-netflix)
* [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
* [Spring Tools Suite](https://spring.io/tools)

## Testing the project
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

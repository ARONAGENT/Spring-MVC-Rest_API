# Spring Boot Web MVC & REST API

## Project Description
This project is an introduction to Spring Boot Web MVC and RESTful API development. It covers core concepts such as MVC architecture, controllers, persistence using JPA, service layer implementation, request mappings, input validation, exception handling, and API response transformation. The project also integrates an in-memory H2 database to perform CRUD operations.

## Topics Covered

### 1. Introduction to Spring Boot Web MVC, MVC Architecture
- Understanding Spring Boot Web MVC architecture
- Role of Model, View, and Controller in Spring MVC

### 2. The Presentation Layer, DTO, and Controllers
- Implementing controllers in Spring Boot
- Using Data Transfer Objects (DTO) for API communication
- Handling HTTP requests and responses

### 3. The Persistence Layer and JPA Repository
- Introduction to JPA and Hibernate
- Using Spring Data JPA for database operations
- Configuring and using an in-memory H2 database

### 4. The Service Layer, Writing Business Logic
- Implementing service layer in Spring Boot
- Separating business logic from controllers
- Best practices for service layer development

### 5. PUT, PATCH, and DELETE Mappings in Spring Web MVC
- Implementing different HTTP methods in REST APIs
- Handling updates with PUT and PATCH
- Deleting resources using DELETE
- **Images included:** Demonstrations of GET (path variable and request param), POST, PUT, PATCH, and DELETE requests

**1.Get Request**

**i)Path variable**
![get(path variable)](https://github.com/user-attachments/assets/cbc35fe0-e2bb-40a3-9d17-f47cc7efe0e7)
**ii)Request param**
![get(requestparam)](https://github.com/user-attachments/assets/7720e41d-f228-49e6-843a-f2e9cbbb7598)

**2.Get Request with Api Response**

![proper(get request)](https://github.com/user-attachments/assets/0c237f45-cc08-4dd5-a8c9-4fbe4e172f9d)

**3.Post Request**

![Post(requestBody)](https://github.com/user-attachments/assets/b7cfa8a3-61c4-4345-9d9a-2198f0646a44)

**4.Post Request with api Response**

![proper(post request)](https://github.com/user-attachments/assets/022f3c9f-d0f9-4397-a201-8a421ae3d404)

**5.Patch Request with api Response**

![proper(patch request)](https://github.com/user-attachments/assets/b50aa7f3-752e-4efb-b8cb-10a9352f203b)

**6.Put Request with api Response**

 ![proper(put request)](https://github.com/user-attachments/assets/ac87c3e9-a142-4efe-8bc8-a290df4d4914)

 **7.Delete Request with api Response**
 
 ![proper(delete Request)](https://github.com/user-attachments/assets/baf8b8f1-75fd-437b-8c42-d3cd8acf6446)


### 6. Input Validation Annotations, Creating Custom Annotations for Validation
- Using built-in validation annotations (@NotNull, @Size, @Pattern, etc.)
- Implementing custom validation annotations in Spring Boot
- **Custom Annotations Implemented:** @ValidPassword and @ValidPrimeNo for enhanced validation

### 7. Exception Handling in Spring Boot Web MVC
- Handling exceptions with @ExceptionHandler
- Using @ControllerAdvice for global exception handling
- Creating custom exception classes

### 8. Transforming API Response in Spring Web MVC
- Customizing API responses with ResponseEntity
- Implementing response wrappers
- Using DTOs to structure API responses

### 9. Extra : Java 8 Lambda and Stream API
- Introduction to Java 8 functional programming
- Using Lambdas and Streams in Java
- Applying Java 8 features in Spring Boot

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/ARONAGENT/Spring-MVC-Rest_API.git
   cd spring-boot-webmvc
   ```
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the H2 Database Console:
   ```
   http://localhost:8080/h2-console
   ```
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: (leave blank)
   **Screenshot of H2 database console**

    ![h2-DBretrival](https://github.com/user-attachments/assets/1e9c284c-193c-4033-af13-f94bcc0b6571)


5. Test the API endpoints using Postman or cURL:
   ```bash
   curl -X GET http://localhost:8080/api/example
   ```

## Prerequisites
- Java 21
- Maven
- IntelliJ IDEA

## Contributing
Feel free to fork this repository and contribute with pull requests to improve the project.

## License
This project is open-source and available under the MIT License.


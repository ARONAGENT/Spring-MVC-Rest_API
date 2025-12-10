# 🌐 Spring Boot Web MVC & REST API

![Visitor Badge](https://visitor-badge.laobi.icu/badge?page_id=ARONAGENT.Spring-MVC-Rest_API)
[![GitHub issues](https://img.shields.io/github/issues/ARONAGENT/Spring-MVC-Rest_API?style=flat-square)](https://github.com/ARONAGENT/Spring-MVC-Rest_API/issues)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Spring MVC](https://img.shields.io/badge/Spring%20MVC-6DB33F?style=flat-square&logo=spring&logoColor=white)](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
[![JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=flat-square&logo=spring&logoColor=white)](https://spring.io/projects/spring-data-jpa)
[![H2 Database](https://img.shields.io/badge/H2%20Database-0000BB?style=flat-square&logo=h2&logoColor=white)](https://www.h2database.com/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Java](https://img.shields.io/badge/Java%2021-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-Proprietary-red?style=flat-square)](#-license)

*"REST APIs are the universal language of modern web applications - master them, and you master the web."*

## 📖 Overview

A comprehensive **Spring Boot Web MVC & RESTful API** project that demonstrates professional API development practices. This project covers everything from basic MVC architecture to advanced topics like custom validation annotations, global exception handling, and structured API responses. Built with industry-standard patterns and backed by an in-memory H2 database for seamless CRUD operations.

### 🎯 What You'll Learn

- 🏗️ **MVC Architecture** - Understanding Model-View-Controller design pattern
- 🎮 **RESTful Controllers** - Building robust API endpoints with proper HTTP methods
- 💾 **JPA & Hibernate** - Database persistence with Spring Data JPA
- 🔧 **Service Layer** - Implementing clean business logic separation
- ✅ **Input Validation** - Using built-in and custom validation annotations
- 🚨 **Exception Handling** - Global error handling with @ControllerAdvice
- 📦 **API Response Transformation** - Structuring consistent API responses with DTOs
- 🗄️ **H2 Database** - In-memory database for rapid development

---

## ✨ Features

- 🌐 **Complete REST API** - Full CRUD operations with GET, POST, PUT, PATCH, and DELETE
- 🎯 **Path Variables & Request Params** - Multiple ways to accept client input
- 📝 **DTO Pattern** - Clean data transfer between layers
- 🔐 **Custom Validators** - @ValidPassword and @ValidPrimeNo annotations
- 🛡️ **Global Exception Handling** - Centralized error management
- 📊 **Structured API Responses** - Consistent response format with metadata
- 💽 **H2 Console Integration** - Easy database inspection and testing
- 🧪 **Production-Ready** - Following Spring Boot best practices
- 📚 **Layered Architecture** - Separation of concerns with Controller → Service → Repository
- ⚡ **Fast Development** - In-memory database with zero configuration

---

## 🛠️ Technologies

<div align="center">

| Technology | Version | Purpose |
|------------|---------|---------|
| ☕ **Java** | 21 | Core Programming Language |
| 🍃 **Spring Boot** | 3.x | Application Framework |
| 🌐 **Spring Web MVC** | Latest | RESTful API Development |
| 💾 **Spring Data JPA** | Latest | Database Abstraction Layer |
| 🗄️ **Hibernate** | Latest | ORM Implementation |
| 🔵 **H2 Database** | Latest | In-Memory Database |
| 📦 **Maven** | 3.8+ | Build & Dependency Management |
| ✅ **Jakarta Validation** | Latest | Input Validation |
| 🛠️ **Lombok** | Latest | Boilerplate Code Reduction |
| 💻 **IntelliJ IDEA** | Latest | Development IDE |

</div>

---

## 🏗️ Project Architecture

```
┌─────────────────────────────────────────────────────┐
│                  Client Layer                        │
│            (Postman / Browser / App)                 │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│              Controller Layer                        │
│        (@RestController, @RequestMapping)            │
│     • Handle HTTP Requests                           │
│     • Input Validation                               │
│     • Response Transformation                        │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│               Service Layer                          │
│              (@Service, @Transactional)              │
│     • Business Logic                                 │
│     • Transaction Management                         │
│     • Data Processing                                │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│            Repository Layer                          │
│          (@Repository, JpaRepository)                │
│     • Database Operations                            │
│     • Query Methods                                  │
│     • CRUD Operations                                │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│              H2 Database                             │
│          (In-Memory Storage)                         │
└─────────────────────────────────────────────────────┘
```

---

## 📸 Project Screenshots

<div align="center">

| # | Screenshot | Description |
|---|------------|-------------|
| 1 | ![Get Request (Path Variable)](https://github.com/user-attachments/assets/cbc35fe0-e2bb-40a3-9d17-f47cc7efe0e7) | **GET Request - Path Variable** |
| 2 | ![Get Request (Request Param)](https://github.com/user-attachments/assets/7720e41d-f228-49e6-843a-f2e9cbbb7598) | **GET Request - Query Parameter** |
| 3 | ![GET with API Response](https://github.com/user-attachments/assets/0c237f45-cc08-4dd5-a8c9-4fbe4e172f9d) | **GET - Structured API Response** |
| 4 | ![POST Request](https://github.com/user-attachments/assets/b7cfa8a3-61c4-4345-9d9a-2198f0646a44) | **POST Request - Request Body** |
| 5 | ![POST with API Response](https://github.com/user-attachments/assets/022f3c9f-d0f9-4397-a201-8a421ae3d404) | **POST - Structured API Response** |
| 6 | ![PATCH with API Response](https://github.com/user-attachments/assets/b50aa7f3-752e-4efb-b8cb-10a9352f203b) | **PATCH - Partial Update Response** |
| 7 | ![PUT with API Response](https://github.com/user-attachments/assets/ac87c3e9-a142-4efe-8bc8-a290df4d4914) | **PUT - Full Update Response** |
| 8 | ![DELETE with API Response](https://github.com/user-attachments/assets/baf8b8f1-75fd-437b-8c42-d3cd8acf6446) | **DELETE - Deletion Confirmation** |
| 9 | ![Custom Validation - Password](https://github.com/user-attachments/assets/b7f6561c-da8d-4300-8e11-72e0a0aab806) | **@ValidPassword - Custom Validator** |
| 10 | ![Custom Validation - Prime Numbers](https://github.com/user-attachments/assets/6502bda5-04e1-4a54-a077-b2ed003efe55) | **@ValidPrimeNo - Custom Validator** |
| 11 | ![API Response with Date](https://github.com/user-attachments/assets/64e09831-2de7-468c-a91a-97106d24fca4) | **API Response - Formatted Date** |
| 12 | ![H2 Database Console](https://github.com/user-attachments/assets/1e9c284c-193c-4033-af13-f94bcc0b6571) | **H2 Console - Database View** |

</div>

---

## 📥 Installation

### Prerequisites

- Java JDK 21 or higher
- Maven 3.8+
- IntelliJ IDEA (or any Java IDE)
- Postman (for API testing)

### Clone the Repository

```bash
git clone https://github.com/ARONAGENT/Spring-MVC-Rest_API.git
cd Spring-MVC-Rest_API
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

Or run directly from IDE:
```bash
java -jar target/spring-mvc-rest-api-1.0.0.jar
```

### Access H2 Database Console

Navigate to: `http://localhost:8080/h2-console`

**Connection Details:**
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** *(leave blank)*

---

## 🎯 Usage

### API Endpoints Overview

#### 🟢 GET Requests
```bash
# Path Variable
GET http://localhost:8080/api/users/{id}

# Query Parameter
GET http://localhost:8080/api/users?name=John&age=25
```

#### 🔵 POST Request
```bash
POST http://localhost:8080/api/users
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "SecureP@ss123",
  "age": 25
}
```

#### 🟡 PUT Request (Full Update)
```bash
PUT http://localhost:8080/api/users/{id}
Content-Type: application/json

{
  "name": "John Updated",
  "email": "john.updated@example.com",
  "password": "NewP@ss456",
  "age": 26
}
```

#### 🟠 PATCH Request (Partial Update)
```bash
PATCH http://localhost:8080/api/users/{id}
Content-Type: application/json

{
  "email": "newemail@example.com"
}
```

#### 🔴 DELETE Request
```bash
DELETE http://localhost:8080/api/users/{id}
```

---

## 🧩 Code Examples

### 1. Controller Layer - REST Endpoints

```java
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserDTO>> getUserById(@PathVariable Long id) {
        UserDTO user = userService.findById(id);
        return ResponseEntity.ok(
            ApiResponse.success(user, "User retrieved successfully")
        );
    }
    
    @PostMapping
    public ResponseEntity<ApiResponse<UserDTO>> createUser(
            @Valid @RequestBody UserDTO userDTO) {
        UserDTO createdUser = userService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(ApiResponse.success(createdUser, "User created successfully"));
    }
}
```

### 2. Custom Validation Annotation - @ValidPassword

```java
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
public @interface ValidPassword {
    String message() default "Password must contain uppercase, lowercase, digit, and special character";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

// Validator Implementation
public class PasswordValidator implements ConstraintValidator<ValidPassword, String> {
    
    private static final String PASSWORD_PATTERN = 
        "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    
    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        return password != null && password.matches(PASSWORD_PATTERN);
    }
}
```

### 3. Custom Validation Annotation - @ValidPrimeNo

```java
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PrimeNumberValidator.class)
public @interface ValidPrimeNo {
    String message() default "Number must be a prime number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

// Validator Implementation
public class PrimeNumberValidator implements ConstraintValidator<ValidPrimeNo, Integer> {
    
    @Override
    public boolean isValid(Integer number, ConstraintValidatorContext context) {
        if (number == null || number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
```

### 4. Global Exception Handler

```java
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<Object>> handleResourceNotFound(
            ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(ApiResponse.error(ex.getMessage(), HttpStatus.NOT_FOUND.value()));
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Object>> handleValidationErrors(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> 
            errors.put(error.getField(), error.getDefaultMessage())
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(ApiResponse.error("Validation failed", errors));
    }
}
```

### 5. API Response Wrapper

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private LocalDateTime timestamp;
    private Integer statusCode;
    
    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(true, message, data, 
            LocalDateTime.now(), HttpStatus.OK.value());
    }
    
    public static <T> ApiResponse<T> error(String message, Integer statusCode) {
        return new ApiResponse<>(false, message, null, 
            LocalDateTime.now(), statusCode);
    }
}
```

### 6. Service Layer Implementation

```java
@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    
    public UserDTO createUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserDTO.class);
    }
    
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return modelMapper.map(user, UserDTO.class);
    }
    
    public UserDTO updateUser(Long id, UserDTO userDTO) {
        User existingUser = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        
        modelMapper.map(userDTO, existingUser);
        User updatedUser = userRepository.save(existingUser);
        return modelMapper.map(updatedUser, UserDTO.class);
    }
    
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
}
```

### 7. JPA Repository

```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    
    List<User> findByAgeGreaterThan(Integer age);
    
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> searchByName(@Param("name") String name);
    
    boolean existsByEmail(String email);
}
```

---

## 📚 Key Concepts Covered

### 1️⃣ Spring Boot Web MVC Architecture
Understanding the Model-View-Controller pattern and how Spring Boot implements it for building RESTful APIs.

### 2️⃣ Presentation Layer with DTOs
Using Data Transfer Objects to separate internal domain models from API contracts, ensuring clean data flow.

### 3️⃣ Persistence Layer with JPA
Leveraging Spring Data JPA for database operations, using repositories for CRUD operations and custom queries.

### 4️⃣ Service Layer Business Logic
Implementing business rules and transaction management in a dedicated service layer for better separation of concerns.

### 5️⃣ HTTP Method Mappings
Complete implementation of RESTful principles with GET, POST, PUT, PATCH, and DELETE operations.

### 6️⃣ Input Validation
Using Jakarta Validation API with built-in annotations and creating custom validators for complex validation rules.

### 7️⃣ Exception Handling
Implementing global exception handling with @ControllerAdvice for consistent error responses across the application.

### 8️⃣ API Response Transformation
Structuring API responses with metadata including success status, messages, timestamps, and status codes.

---

## 🔧 Configuration

### Application Properties

```properties
# Server Configuration
server.port=8080

# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# Logging
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate.SQL=DEBUG
```

---

## 🤝 Contributing

Contributions are always welcome! Here's how you can help:

1. 🍴 Fork the repository
2. 🌿 Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the branch (`git push origin feature/AmazingFeature`)
5. 🔃 Open a Pull Request

### Code of Conduct

Please be respectful and constructive in all interactions.

---

## 📄 License

```
Copyright (c) 2024 ARONAGENT

This project and its source code are the exclusive property of the author.
Unauthorized copying, modification, distribution, or commercial use is strictly prohibited.
Limited use is granted for learning, reviewing, and non-commercial demonstration purposes only.
No warranties are provided; use at your own risk.
For permissions beyond this notice, contact: rohanuke1@gmail.com
```

---

## 🙏 Acknowledgments

- 🍃 **Spring Team** - For the incredible Spring Boot and Spring MVC frameworks
- 💾 **Hibernate Team** - For powerful ORM capabilities
- 🗄️ **H2 Database** - For the lightweight in-memory database
- 🌐 **Open Source Community** - For continuous inspiration and knowledge sharing
- 📚 **Spring Documentation** - For comprehensive guides and best practices
- 🎓 **Java Community** - For REST API design patterns and conventions
- 🛠️ **JetBrains** - For IntelliJ IDEA development environment

---

## 📞 Connect & Support

[![GitHub](https://img.shields.io/badge/GitHub-ARONAGENT-181717?style=flat-square&logo=github)](https://github.com/ARONAGENT)
[![Repository](https://img.shields.io/badge/Repository-Spring--MVC--Rest__API-blue?style=flat-square&logo=github)](https://github.com/ARONAGENT/Spring-MVC-Rest_API)

### 🌟 Star this repo if you find it helpful! ⭐

**Built with ❤️ by [ARONAGENT](https://github.com/ARONAGENT)**

---

<div align="center">

**Happy Coding! 💻✨**

*"RESTful APIs are the bridges that connect applications - build them strong, build them right."*

</div>

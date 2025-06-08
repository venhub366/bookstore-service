# Bookstore Service

A Spring Boot microservice for managing bookstore operations. This service provides RESTful APIs for managing books, authors, and related operations.

## Features

- Book management (CRUD operations)
- Author management
- Search functionality
- RESTful API endpoints

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- Spring Boot 3.5.0
- PostgreSQL database

## Project Setup

1. **Clone the repository**:
```bash
git clone <repository-url>
cd bookstore-service
```

2. **Install Maven Wrapper** (if not already present):
```bash
mvn wrapper:wrapper
```

3. **Build the project**:

Using Maven Wrapper:
- On Windows:
```bash
./mvnw.cmd clean install
```
- On Unix-like systems (Linux/Mac):
```bash
./mvnw clean install
```

Using Maven directly:
```bash
mvn clean install
```

4. **Force update dependencies** (if needed):
```bash
mvn clean install -U
```
or with Maven Wrapper:
```bash
./mvnw clean install -U
```

5. **Skip tests during build** (optional):
```bash
mvn clean install -DskipTests
```
or with Maven Wrapper:
```bash
./mvnw clean install -DskipTests
```

6. **Run the application**:

Using Maven Wrapper:
- On Windows:
```bash
./mvnw.cmd spring-boot:run
```
- On Unix-like systems (Linux/Mac):
```bash
./mvnw spring-boot:run
```

Using Maven directly:
```bash
mvn spring-boot:run
```

The application will start on port 8080 by default.

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/bookstore/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       ├── model/
│   │       └── BookstoreServiceApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/bookstore/
```

## Database Configuration

The application uses PostgreSQL as its database. Make sure to:
1. Have PostgreSQL installed and running
2. Create a database named `bookstore`
3. Update the database configuration in `application.properties` if needed

## API Documentation

Once the application is running, you can access the Swagger UI documentation at:
```
http://localhost:3031/swagger-ui.html
```

## Development Workflow

1. **Code Review Process**:
   - Create a feature branch from main
   - Make your changes
   - Submit a Pull Request
   - Get code review approval
   - Merge to main

2. **Build Verification**:
   - Run `mvn clean install` to verify your changes
   - Ensure all tests pass
   - Check for any code style issues

3. **Running Tests**:
```bash
mvn test
```
or with Maven Wrapper:
```bash
./mvnw test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details. 
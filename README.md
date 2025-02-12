
# Question and Answer Application

This is a Java-based application for managing a question and answer platform. The application allows users to post, retrieve, and categorize questions using a RESTful API built with Spring Boot. The project is structured with Maven for dependency management and IntelliJ IDEA as the Integrated Development Environment (IDE).

## Technologies Used
- **Java** - The primary programming language for the application.
- **Spring Boot** - Framework for building the backend RESTful API.
- **PostgreSQL** - Database used to store questions and answers.
- **Maven** - Build automation tool used to manage project dependencies.
- **IntelliJ IDEA** - Integrated Development Environment (IDE) used for development.
- **Postman** - Tool for testing the REST API endpoints.

## Features
- **Add Questions**: Allows users to submit new questions.
- **Retrieve Questions**: Allows users to fetch questions stored in the database.
- **Categorize Questions**: Users can categorize questions into different topics.
- **CRUD Operations**: Standard Create, Read, Update, Delete functionality for questions and answers.

## Getting Started

To get started with this project on your local machine, follow these steps:

### Prerequisites

- **JDK 11+** (Ensure you have Java 11 or a newer version installed)
- **Maven** (for building and managing the project)
- **PostgreSQL** (installed and running, configured with a database to store questions)

### Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/MohamedRafshan/quizApp_java.git
   cd quizApp_java

1. **Clone the repository**:
    ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    spring.jpa.hibernate.ddl-auto=update
    
3. **Install dependencies using Maven:**:
    ```bash
    mvn install
    
4. **Clone the repository**:
    ```bash
    mvn spring-boot:run


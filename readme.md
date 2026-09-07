# REST API Practice — Java

A hands-on REST API project built while learning **RESTful Web Services with Java** using Jersey, JDBC, MySQL, and Postman.

This project was created as a practical exercise to understand how REST APIs work, how HTTP methods map to CRUD operations, and how a Java REST API communicates with a MySQL database.

## 🚀 Technologies Used

* Java 17
* Jersey 3.1.11
* JAX-RS / Jakarta REST
* Maven
* Apache Tomcat 10.1
* MySQL
* JDBC
* Postman
* IntelliJ IDEA

## 📚 Concepts Learned

### REST API Fundamentals

* What is an API?
* What is REST?
* RESTful Web Services
* Resources and endpoints
* HTTP methods
* CRUD operations
* Path parameters
* Request and response data

### Jersey

* Creating a Jersey REST project
* Configuring `web.xml`
* Creating Resource classes
* `@Path`
* `@GET`
* `@POST`
* `@PUT`
* `@DELETE`
* `@PathParam`
* `@Consumes`
* `@Produces`

### Data Formats

* JSON
* XML
* JSON → Java Object
* Java Object → JSON
* XML → Java Object

### Database Integration

* MySQL database integration
* JDBC
* `Connection`
* `PreparedStatement`
* `ResultSet`
* CRUD operations using SQL
* Repository pattern

### API Testing

* Postman
* GET requests
* POST requests
* PUT requests
* DELETE requests
* Sending JSON/XML request bodies
* Testing API endpoints

## 🏗️ Project Architecture

```text
                 Postman
                    │
                    ▼
             StudentResource
                    │
                    ▼
            StudentRepository
                    │
                    ▼
                  JDBC
                    │
                    ▼
                 MySQL
```

## 📁 Project Structure

```text
jersey-rest-practice/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── arun/
│       │           └── resource/
│       │               ├── Student.java
│       │               ├── StudentResource.java
│       │               ├── StudentRepository.java
│       │               └── MySQLConnection.java
│       │
│       └── webapp/
│           └── WEB-INF/
│               └── web.xml
│
├── pom.xml
└── README.md
```

## 🔗 API Endpoints

### Get All Students

```http
GET /api/students
```

Returns all students from the database.

### Get Student by ID

```http
GET /api/students/{id}
```

Example:

```http
GET /api/students/1
```

### Create Student

```http
POST /api/students
```

Request body:

```json
{
    "id": 6,
    "name": "Rahul",
    "email": "rahul@gmail.com"
}
```

The API accepts both JSON and XML.

### Update Student

```http
PUT /api/students/{id}
```

Example:

```http
PUT /api/students/1
```

Request body:

```json
{
    "name": "Arun Kumar",
    "email": "arunkumar@gmail.com"
}
```

### Delete Student

```http
DELETE /api/students/{id}
```

Example:

```http
DELETE /api/students/1
```

## 🗄️ Database

Database:

```text
student_api
```

Table:

```text
students
```

Columns:

| Column | Type    |
| ------ | ------- |
| id     | INT     |
| name   | VARCHAR |
| email  | VARCHAR |

## 🔄 CRUD Mapping

| Operation | HTTP Method | SQL    |
| --------- | ----------- | ------ |
| Create    | POST        | INSERT |
| Read      | GET         | SELECT |
| Update    | PUT         | UPDATE |
| Delete    | DELETE      | DELETE |

## 🧠 Key Takeaways

* REST APIs use HTTP methods to operate on resources.
* `@Path` defines the API endpoint.
* `@PathParam` extracts values from the URL.
* `@Consumes` specifies the data format accepted by the API.
* `@Produces` specifies the response format.
* Jersey can convert JSON/XML data into Java objects.
* JDBC allows the REST API to communicate with MySQL.
* `PreparedStatement` is used to execute parameterized SQL queries.
* Postman can be used to test REST API endpoints.

## 📝 Learning Progress

* [x] REST API fundamentals
* [x] RESTful Web Services
* [x] Jersey setup
* [x] Resource classes
* [x] List as Resource
* [x] Repository pattern
* [x] Postman
* [x] GET
* [x] POST
* [x] Path Parameters
* [x] JSON
* [x] MySQL Repository
* [x] JSON/XML with `@Consumes`
* [x] PUT
* [x] DELETE
* [x] REST API Recap

## 🎯 Next Step

After completing the Jersey-based REST API, the next step is to learn how to build REST APIs using **Spring Boot**, followed by **Spring Data JPA** and eventually **Spring Security/JWT**.

---

### Course

**REST API | Web Service Tutorial — Telusko**

The course covers REST fundamentals, Jersey, CRUD operations, Postman, JSON/XML, MySQL integration, and introduces Spring REST/Spring JPA.

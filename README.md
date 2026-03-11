# Spring Classic vs Spring Boot

Repository:

[git@github.com](mailto:git@github.com):SilDan/spring-classic-vs-spring-boot.git

This repository contains several implementations of the same simple **User REST API** to demonstrate the evolution of Java web development:

1. **Pure Java Servlets**
2. **Classic Spring MVC configuration**
3. **Spring Boot auto-configuration**

The goal is to understand what Spring and Spring Boot actually automate on top of the Servlet API.

---

# Repository Structure

```
spring-classic-vs-spring-boot
│
├── user-api-http-servlet
│   Pure Servlet implementation
│   - HttpServlet based
│   - manual request handling
│   - deployed as WAR
│   - requires external servlet container
│
├── user-api-spring-classic
│   Traditional Spring MVC project
│   - manual configuration
│   - WAR packaging
│   - external servlet container
│
└── user-api-spring-boot
    Spring Boot project
    - auto configuration
    - embedded Tomcat
    - executable JAR
```

All projects implement the same REST API so that the differences in configuration, infrastructure, and setup become clear.

---

# User API

The API provides a minimal user management service.

## Endpoints

### Get all users

GET /api/users

Returns a list of users.

---

### Get user by ID

GET /api/users/{id}

Returns a single user.

---

### Create user

POST /api/users

Example request body:

```json
{
  "name": "John Doe",
  "email": "john@example.com"
}
```

---

# Project 1: Pure Servlet API

Location:

```
user-api-http-servlet
```

Characteristics:

* Java Servlet API
* `HttpServlet` based implementation
* manual HTTP request handling
* WAR packaging
* requires a servlet container (Tomcat / Jetty / etc.)

Purpose:

This project shows how Java web applications work **without frameworks**. It helps understanding what frameworks like Spring MVC build on top of.

---

# Project 2: Classic Spring MVC

Location:

```
user-api-spring-classic
```

Characteristics:

* Maven project
* WAR packaging
* manual Spring configuration
* explicit DispatcherServlet registration
* requires a servlet container (Tomcat / Jetty / etc.)

Main components:

* WebAppInitializer
* WebConfig
* Controller
* Service
* Repository

Spring MVC internally still uses the **Servlet API**, but abstracts much of the boilerplate.

---

# Project 3: Spring Boot

Location:

```
user-api-spring-boot
```

Characteristics:

* minimal configuration
* embedded Tomcat server
* executable application with `main()`
* auto configuration
* no manual servlet container setup required

Spring Boot automatically configures Spring MVC and the embedded server.

---

# Architecture

All implementations follow a layered architecture:

```
Client
   ↓
Controller / Servlet
   ↓
Service
   ↓
Repository
   ↓
Model
```

The web layer evolves across the projects:

```
Servlet API
   ↓
Spring MVC
   ↓
Spring Boot
```

---

# Technologies

* Java 17
* Maven
* Servlet API
* Spring Framework
* Spring MVC
* Spring Boot

---

# Learning Goals

This project demonstrates:

* the Java **Servlet API**
* how HTTP requests are handled in Java
* Spring IoC container
* Dependency Injection
* Spring MVC request handling
* the difference between manual configuration and Spring Boot auto-configuration
* what Spring Boot automates

---

# Future Improvements

Planned additions:

* database integration
* H2 database
* PostgreSQL example
* comparison of persistence approaches
* basic tests

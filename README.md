# Spring Classic vs Spring Boot

Repository:
[git@github.com](mailto:git@github.com):SilDan/spring-classic-vs-spring-boot.git

This repository contains two implementations of the same simple **User REST API** to demonstrate the difference between **classic Spring MVC configuration** and **Spring Boot auto-configuration**.

The goal is to understand what Spring Boot actually automates.

---

# Repository Structure

```
spring-classic-vs-spring-boot
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

Both projects implement the same REST API so that the differences in configuration and setup become clear.

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

# Project 1: Classic Spring MVC

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

---

# Project 2: Spring Boot

Location:

```
user-api-spring-boot
```

Characteristics:

* minimal configuration
* embedded Tomcat server
* executable application with main()
* auto configuration

---

# Architecture

Both projects follow a layered architecture:

```
Client
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Model
```

The web layer uses **Spring MVC**.

---

# Technologies

* Java 17
* Maven
* Spring Framework
* Spring MVC
* Spring Boot

---

# Learning Goals

This project demonstrates:

* Spring IoC container
* Dependency Injection
* Spring MVC request handling
* the difference between manual configuration and Spring Boot auto-configuration

---

# Future Improvements

Planned additions:

* database integration
* H2 database
* PostgreSQL example
* comparison of persistence approaches
* basic tests

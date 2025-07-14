# Beyblade X API

A Spring Boot RESTful service exposing Beyblade X tops and their parts.

## Features

- **List** all Beyblades
- **Get** details of a single Beyblade (with parts)
- **Health** and **Info** endpoints via Actuator
- **In-memory** JSON data source (easily swappable with JPA + PostgreSQL)

---

## Getting Started

### Prerequisites

- **Java 21+**
- **Gradle 8.x** (or use the [Gradle Wrapper](./gradlew))
- **Docker** (optional, for container builds)

### Build & Run

#### 1. With Gradle

```bash
./gradlew clean build
java -jar build/libs/beyblade-x-api.jar
```
## Live Services
:warning: Do note, API may take about a minutes to have the container spin up :warning:
https://beyblade-x-api.onrender.com/

### Swagger Documentation
https://beyblade-x-api.onrender.com/swagger-ui.html

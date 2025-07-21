# 🔗 Microservice Contract Testing (Spring Cloud Contract)

This project demonstrates how to implement consumer-driven contract testing between microservices using **Spring Cloud Contract**. It ensures API compatibility and prevents integration failures across teams.

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Spring Cloud Contract
- Maven
- JUnit

## 🧩 Modules Overview

| Module       | Role       | Description                             |
|--------------|------------|-----------------------------------------|
| `producer`   | API server | Exposes contracts as stubs              |
| `consumer`   | Client     | Uses generated stubs to test against API expectations |

---

## 🔧 Features
- Generate API stubs from contracts
- Verify consumer expectations during CI
- Decouples frontend/backend development
- Follows TDD for microservices

---

## 🧪 Contract Test Example

1. Define a contract in the producer:
```groovy
Contract.make {
    request {
        method 'GET'
        url '/hello'
    }
    response {
        status OK()
        body("Hello from Producer")
    }
}

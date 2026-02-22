## Nexora API Gateway

### Overview

The API Gateway serves as the single entry point for the Nexora Platform microservices ecosystem.

It is responsible for:

* Centralized request routing
* Integration with Service Discovery
* Future security filtering (JWT validation)
* Monitoring and health checks

---

### Port

Runs on:

```
8080
```

---

### Service Discovery

Registered with:

```
http://localhost:8761
```

---

### Tech Stack

* Java 21
* Spring Boot 3
* Spring Cloud Gateway
* Eureka Discovery Client
* Actuator

---

### Architecture Role

```
Client → API Gateway → Microservices
```

---

### How to Run

1. Start nexora-discovery-service
2. Run this service
3. Verify registration inside Eureka Dashboard

---
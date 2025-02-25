# Dependency Injection in Java: A Practical Exploration

## Introduction

Dependency Injection (DI) is a fundamental principle of software engineering that promotes loose coupling between components. It allows better code maintainability, testability, and scalability by shifting the responsibility of object creation from the dependent class to an external entity.

This repository serves as a practical exploration of DI techniques in Java, structured as a progression from manual dependency management to modern frameworks like **Spring**. It includes multiple implementations of a simulated application demonstrating different DI techniques.

## Objectives

- Understand the importance of Dependency Injection.
- Explore various DI techniques, from manual injection to Spring framework.
- Implement a multi-layered architecture with **Data Layer**, **Service Layer**, and **Presentation Layer**.
- Respect the **Open-Closed Principle (OCP)** from SOLID principles.

---

## Evolution of Dependency Injection

### 1️⃣ **Static Injection (Manual DI with Constructor & Setter Injection)**
In the first version, dependencies are manually created using the `new` keyword and injected via:
- **Constructor Injection**: Passing dependencies through class constructors.
- **Setter Injection**: Using setter methods to assign dependencies after object creation.

**Drawback**: This approach tightly couples classes, making changes difficult and requiring frequent modifications in dependent classes.

---

### 2️⃣ **Dynamic Injection (Configuration File-Based DI)**
To decouple dependency management, a configuration file (text file) is introduced. The dependencies are declared in this file and dynamically loaded at runtime.

**Advantages**:
- More flexible than static injection.
- Helps understand the principle of **Inversion of Control (IoC)**.

**Drawback**: Still requires manual handling of dependencies, which can be cumbersome for large applications.

---

### 3️⃣ **Spring DI - XML Configuration Approach**
Spring Framework simplifies dependency management by handling the object lifecycle automatically. This version uses:
- **XML-based Configuration**: Beans (instances) are declared in an XML file and managed by the Spring Container.
- **Spring IoC Container**: Responsible for injecting dependencies at runtime.

**Advantages**:
- No need to manually instantiate objects.
- Supports **loose coupling** and **modular development**.

**Drawback**: XML-based configuration can be verbose and harder to maintain.

---

### 4️⃣ **Spring DI - Annotation-Based Approach (Modern Method)**
Spring introduced **annotations** to simplify DI, eliminating the need for extensive XML configurations.
- Uses `@Component` to mark classes as beans.
- Uses `@Autowired` to automatically inject dependencies.

**Advantages**:
- Clean and concise configuration.
- Reduces boilerplate code.
- Preferred method in modern applications.

---

## Summary of Implementations

| Version | DI Methodology | Key Features |
|---------|--------------|--------------|
| **1** | Static Injection | Manual object creation using `new`, constructor and setter injection |
| **2** | Dynamic Injection | External text file to define dependencies dynamically |
| **3** | Spring XML | Dependency injection using Spring XML configuration |
| **4** | Spring Annotations | Modern DI using `@Component`, `@Autowired` annotations and constructor|

---

## How to Run the Project

### Prerequisites
- Java 17+
- Maven 
- Adding some Spring Boot dependencies (core, context, and bean)

## Conclusion

Through this activity, we explored the transition from **manual dependency injection** to **modern Spring-based DI**, highlighting the importance of **Inversion of Control (IoC)** and **loose coupling**. This evolution showcases how frameworks like Spring improve development efficiency, allowing developers to focus on business logic rather than object creation and dependency management.

---

## Author
**Mohammed Haji**  
Feel free to contribute or reach out for discussions!


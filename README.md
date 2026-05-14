# Spring Boot Learning Journey

A step-by-step learning project following the **Web Development in Java Spring Boot** playlist by Professor Sluiter. Each topic folder is a complete, runnable project that builds on the previous one.

## Project Structure

```
├── topic1-1/       # Base Spring Boot Application
├── topic2-1/       # Controllers & Thymeleaf
├── topic2-2/       # Form Validation with Jakarta Validation
├── topic2-3/       # Layout Fragments & Templating
└── topic3-1/       # Dependency Injection & Configuration
```

## Topic Breakdown

| Topic | Focus |
|-------|-------|
| 1-1 | Spring Boot setup, basic REST endpoint, Thymeleaf rendering |
| 2-1 | Controllers, Models, displaying data in HTML tables |
| 2-2 | Form submission, Jakarta Validation, error handling |
| 2-3 | Thymeleaf fragments, layout composition, Bootstrap 5 |
| 3-1 | `@Configuration`, `@Bean`, interface-based DI, `@Autowired` |

## Getting Started

### Prerequisites
- JDK 17+
- Maven 3.6+

### Run Any Topic

```bash
cd topic2-1
mvn spring-boot:run
# Open http://localhost:8080
```

## Credit

All credit goes to **Professor Shad Sluiter** for the excellent tutorial content.

- [YouTube Channel](https://www.youtube.com/@shadsluiter)
- [Web Development in Java Spring Boot - Playlist](https://www.youtube.com/playlist?list=PLhPyEFL5u-i0MHw41OapxjLlsl0s2XQyE)
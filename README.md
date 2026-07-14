# 🏥 Hospital Management System

A **Spring Boot REST API** for managing hospital operations such as **Patients, Doctors, Appointments, Insurance, and Departments**. This project demonstrates the use of **Spring Boot, Spring Data JPA, Hibernate, PostgreSQL, and RESTful APIs** while following a layered architecture.

---

## 🚀 Features

- 👨‍⚕️ Doctor Management
- 🧑 Patient Management
- 🏥 Department Management
- 📅 Appointment Scheduling
- 🛡️ Insurance Management
- 🔗 Entity Relationships using JPA
- ✅ Validation and Constraint Handling
- 🗄️ PostgreSQL Database Integration

---

## 🛠️ Tech Stack

- Java 22
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- PostgreSQL
- Lombok
- Maven
- JUnit 5

---

## 📂 Project Structure

```
src
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── config
```

---

## 🗃️ Database Design

### Patient
- Id
- Name
- Email
- Gender
- Date of Birth
- Blood Group
- Created At

### Doctor
- Id
- Name
- Email
- Specialization

### Appointment
- Id
- Time
- Reason

### Insurance
- Id
- Policy Number
- Provider
- Valid Until
- Created At

### Department
- Id
- Name

---

## 🔗 Entity Relationships

```
Patient
   │
   ├─────────────── One-to-One ───────────────► Insurance

Patient
   │
   └────────────── One-to-Many ───────────────► Appointment

Doctor
   │
   └────────────── One-to-Many ───────────────► Appointment

Department
   │
   └────────────── One-to-Many ───────────────► Doctor
```

---

## 📦 JPA Relationships Used

- One-to-One
- One-to-Many
- Many-to-One

---

## 📚 Spring Boot Concepts Implemented

- Dependency Injection
- Service Layer
- Repository Layer
- Entity Mapping
- Hibernate ORM
- Cascade Operations
- Fetching Data using JPA
- Derived Query Methods
- Transaction Management
- Constraint Handling

---

## 🧪 Testing

The project includes JUnit tests for:

- Patient Repository
- Insurance Assignment
- Appointment Creation
- Entity Relationships

---

## ⚙️ Database

**Database:** PostgreSQL

Example configuration:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/hospitalDB
spring.datasource.username=postgres
spring.datasource.password=****
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Running the Project

Clone the repository

```bash
git clone https://github.com/your-username/hospital-management.git
```

Navigate into the project

```bash
cd hospital-management
```

Run using Maven

```bash
mvn spring-boot:run
```

Or run the `HospitalmanagementApplication` class directly from your IDE.

---

## 🎯 Learning Outcomes

This project helped in understanding:

- Spring Boot Architecture
- REST API Development
- Hibernate ORM
- Entity Relationships
- Database Normalization
- PostgreSQL Integration
- Layered Architecture
- Repository Pattern
- Transaction Management
- JUnit Testing

---

## 📈 Future Improvements

- JWT Authentication & Authorization
- Role-Based Access Control
- DTO Mapping using MapStruct
- Swagger/OpenAPI Documentation
- Global Exception Handling
- Pagination & Sorting
- Search & Filtering APIs
- Docker Support
- Spring Security
- File Uploads
- Email Notifications
- Audit Logging

---

## 👨‍💻 Author

**Prabuddha Pal**

- Java Backend Developer
- Spring Boot Enthusiast
- PostgreSQL | Hibernate | REST APIs
- Competitive Programmer (Codeforces • CodeChef • AtCoder)

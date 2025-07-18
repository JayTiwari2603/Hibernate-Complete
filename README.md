# 🧠 Hibernate Complete Project (Basic + Advanced)

This project demonstrates a complete implementation of **Hibernate ORM** using:
- CRUD operations
- One-to-Many & Many-to-One relationships
- HQL (Hibernate Query Language)
- Pagination
- DAO structure
- Hibernate Validator (optional)

---

## 🚀 Features

| Feature            | Description                                      |
|--------------------|--------------------------------------------------|
| Basic Hibernate    | Save and fetch simple entity (like Student)      |
| OneToMany Mapping  | Department ↔ Employees                           |
| DAO Layer          | DepartmentDao handles database operations        |
| HQL Queries        | Filter employees by department name              |
| Pagination         | Fetch employees in pages (5 at a time)           |
| Validator (Extra)  | Add field constraints like @NotNull, @Min        |

---

## 🛠️ Tech Stack

- Java 17
- Hibernate 6.x
- MySQL
- Eclipse IDE
- Maven (optional)

---

## 📁 Project Structure

src/main/java
├── com.lcwd.hiber
│ ├── Main.java
│ ├── App.java
│ ├── HqlExample.java
│ ├── PaginateExample.java
│
├── com.lcwd.hiber.dao
│ └── DepartmentDao.java
│
├── com.lcwd.hiber.entities
│ ├── Department.java
│ ├── Employee.java
│ └── Student.java
│
└── com.lcwd.hiber.util
└── HibernateUtil.java

src/main/resources
└── hibernate.cfg.xml

## ▶️ How to Run

1. Create a MySQL database named:
   ```sql
   CREATE DATABASE hiber;

   Update hibernate.cfg.xml with your username/password

Run Main.java to:

Insert a Department

Add two Employees

Query using HQL

Fetch using Pagination

🙌 Author
Jayantkumar Tiwari
Student | Java Full Stack Developer in Progress 🚀

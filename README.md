# Full Stack Todo Application

A full stack Todo Management Application built using Spring Boot (Backend), PostgreSQL (Database), and React (Frontend).

---

## Tech Stack

Backend:
- Spring Boot
- Spring Data JPA
- Hibernate

Database:
- PostgreSQL

Frontend:
- React (useState, useEffect)
- Fetch API

---

## Features

- Create Todo
- View All Todos
- Update Todo (Mark Complete / Undo)
- Delete Todo
- Persistent Storage using PostgreSQL
- Modern Responsive UI

---

## Project Architecture

Backend:
- Controller Layer
- Service Layer
- Repository Layer
- Entity (Model)

Frontend:
- React Functional Components
- State Management using Hooks
- API Integration with Spring Boot

---

## How To Run The Project

### Backend Setup

1. Install PostgreSQL
2. Create database:

   CREATE DATABASE todo_db;

3. Update application.properties with your DB username and password
4. Run TodoApplication.java

Backend runs at:
http://localhost:8080

---

### Frontend Setup

1. Navigate to frontend folder:

   cd todo-frontend

2. Install dependencies:

   npm install

3. Start application:

   npm start

Frontend runs at:
http://localhost:3000

---

## API Endpoints

GET     /todos
POST    /todos
PUT     /todos/{id}
DELETE  /todos/{id}

---



## Author

Shubhada Gaikwad
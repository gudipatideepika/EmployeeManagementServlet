# Employee Management Servlet

A simple **Employee Management System** built using **Java Servlets, JSP, JDBC, and MySQL**. This project demonstrates CRUD (Create, Read, Update, Delete) operations using the MVC architecture and is suitable for beginners learning Java web development.

---

📌 Features

- ➕ Add New Employee
- 👀 View All Employees
- ✏️ Update Employee Details
- ❌ Delete Employee
- 🔍 Search Employee by ID
- 💾 MySQL Database Integration
- 🎨 Responsive User Interface
- ⚡ Fast and Simple CRUD Operations

---

🛠️ Technologies Used

- Java
- Java Servlets
- JSP (JavaServer Pages)
- JDBC
- MySQL
- Apache Tomcat
- HTML5
- CSS3
- Bootstrap
- Eclipse IDE

---

## 📂 Project Structure

```
EmployeeManagementServlet/
│
├── src/
│   ├── com.emp.dao/
│   │      EmployeeDAO.java
│   │
│   ├── com.emp.model/
│   │      Employee.java
│   │
│   ├── com.emp.servlet/
│   │      AddEmployeeServlet.java
│   │      UpdateEmployeeServlet.java
│   │      DeleteEmployeeServlet.java
│   │      ViewEmployeeServlet.java
│   │      SearchEmployeeServlet.java
│   │
│   └── com.emp.util/
│          DBConnection.java
│
├── WebContent/
│   ├── index.jsp
│   ├── addEmployee.jsp
│   ├── viewEmployees.jsp
│   ├── updateEmployee.jsp
│   ├── searchEmployee.jsp
│   ├── css/
│   └── images/
│
└── README.md
```

---

##Prerequisites

Before running the project, make sure you have:

- Java JDK 8 or above
- Eclipse IDE (Enterprise Edition recommended)
- Apache Tomcat 9 or above
- MySQL Server
- MySQL Connector/J (JDBC Driver)

---

## Database Setup

Create a database named:

```sql
CREATE DATABASE employeemanagementsystem;
```

Use the following table:

```sql
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    department VARCHAR(100),
    salary DOUBLE
);

## Configure Database Connection

Update your database credentials inside:

```
DBConnection.java
```

Example:
java
String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
String username = "root";
String password = "your_password";

## How to Run

1. Clone the repository.

git clone https://github.com/your-username/EmployeeManagementServlet.git

2. Import the project into Eclipse.

3. Add Apache Tomcat Server.

4. Configure MySQL database.

5. Add MySQL JDBC Driver to the project.

6. Run the project on Tomcat.

7. Open your browser:


http://localhost:8080/EmployeeManagementServlet/





## CRUD Operations

### Create
Add new employee records to the database.

### Read
Display all employees in a table.

### Update
Modify employee details.

### Delete
Remove employee records permanently.

### Search
Find an employee using Employee ID.

## Future Enhancements

- User Authentication
- Role-Based Access
- Pagination
- Employee Profile Image Upload
- Export Data to Excel/PDF
- REST API Integration
- Email Notifications

## Learning Outcomes

Through this project, you will learn:

- Java Servlet Development
- MVC Architecture
- JDBC Connectivity
- MySQL Database Operations
- CRUD Implementation
- JSP Integration
- Form Handling
- Session Management Basics
- Web Application Deployment using Tomcat

##Author

Deepika Gudipati

Aspiring Java Full Stack Developer

- Java
- JDBC
- Servlets
- JSP
- MySQL
- Spring Boot
- Hibernate

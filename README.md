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


**Screenshots**

- Home Page
- <img width="1817" height="837" alt="Screenshot 2026-07-05 105239" src="https://github.com/user-attachments/assets/b8388ff4-8feb-48d3-9591-10ceeadf686b" />

- Add Employee
<img width="1640" height="845" alt="Screenshot 2026-07-05 105301" src="https://github.com/user-attachments/assets/1237eef9-5e00-4130-b1e6-e3875fa753f6" />

- View Employees
<img width="1822" height="832" alt="Screenshot 2026-07-05 105321" src="https://github.com/user-attachments/assets/6db2e06a-31af-421b-9b9a-8d0fc2826fff" />

- Update Employee
<img width="1781" height="855" alt="Screenshot 2026-07-05 105339" src="https://github.com/user-attachments/assets/038a3788-e76e-4730-9280-1ba70862a95e" />

- Delete Employee
<img width="1800" height="842" alt="Screenshot 2026-07-05 105354" src="https://github.com/user-attachments/assets/5c5e4ddc-6fe9-407f-b02a-010ca7e127f0" />


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

**Author**

Deepika Gudipati

Aspiring Java Full Stack Developer

- Java
- JDBC
- Servlets
- JSP
- MySQL
- Spring Boot
- Hibernate

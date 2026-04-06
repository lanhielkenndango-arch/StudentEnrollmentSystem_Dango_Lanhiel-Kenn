# Student Enrollment System

A Java Swing-based desktop application that provides a complete Graphical User Interface (GUI) for managing students, courses, and enrollments. This project demonstrates full CRUD (Create, Read, Update, Delete) operations connected to a MySQL database using JDBC.

## 🚀 Features

* **Student Management:** Add new students, view the student list, update student details, and delete student records.
* **Course Management:** Add, view, update, and delete course offerings (Course Name, Description, Credits).
* **Enrollment Management:** Enroll students into specific courses using dynamic dropdowns, view all enrollments, and manage existing records.
* **Custom Modern UI:** Features a custom-built, modern user interface using custom Java Swing components (`RoundedButton`, `RoundedPanel`, `RoundedTextField`) to move away from the basic, dated Swing look.
* **Database Integration:** Fully integrated with a MySQL database using the Data Access Object (DAO) design pattern for clean and maintainable code.

## 🛠️ Technologies Used

* **Language:** Java (JDK 8 or higher)
* **GUI Framework:** Java Swing
* **Database:** MySQL
* **Database Connectivity:** JDBC (MySQL Connector/J)
* **Database Design:** MySQL Workbench (`.mwb`)

## 📂 Project Structure

* `StudentEnrollmentSystem.java`: The main entry point of the application.
* **GUI Windows:**
  * `StudentManagementWindow.java`: Handles Student CRUD operations.
  * `CourseManagementWindow.java`: Handles Course CRUD operations.
  * `EnrollmentManagementWindow.java`: Handles assigning students to courses.
* **Database & Models:**
  * `DBConnection.java`: Manages the connection to the MySQL database.
  * `Student.java`: The model class representing a Student entity.
  * `StudentDAO.java`: The Data Access Object handling SQL queries for students.
* **Custom UI Components:**
  * `RoundedButton.java`, `RoundedPanel.java`, `RoundedTextField.java`: Custom classes to create a polished, modern interface.

## ⚙️ Prerequisites

Before running this project, ensure you have the following installed:
1. **Java Development Kit (JDK)** installed on your machine.
2. **MySQL Server** and **MySQL Workbench** installed and running.
3. **MySQL JDBC Driver** (`mysql-connector-j.jar`) added to your project's libraries/classpath.

## 🗄️ Database Setup

1. Open MySQL Workbench.
2. Open the provided `Enrollment System.mwb` file to view the Entity-Relationship Diagram (ERD).
3. Forward Engineer the model or manually create a database named `student_enrollment_system`.
4. Ensure the following tables are created according to the ERD:
   * `Student` (student_id, first_name, last_name, age, email)
   * `Course` (course_id, course_name, course_description, credits)
   * `Enrolled Subject` (enrollment_id, student_id, course_id, enrollment_date)

## 🚀 How to Run

1. Clone or download the repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., NetBeans, Eclipse, IntelliJ IDEA).
3. **Important Database Configuration:**
   * Open `DBConnection.java`.
   * Locate the `DriverManager.getConnection()` method.
   * Update the database URL, username (`root`), and password (`SkennMYpets0025`) to match your local MySQL server credentials.
4. Add the MySQL JDBC Driver to your project's build path/libraries.
5. Run the `StudentEnrollmentSystem.java` file to launch the application.

## 🎥 Demonstration

As per project requirements, a demonstration video must be recorded showing:
1. The MySQL database tables before running the app.
2. The application successfully adding, updating, viewing, and deleting records across the Student, Course, and Enrollment windows.
3. The database reflecting these real-time changes. 

---
*Developed as an activity for integrating Java Swing with MySQL CRUD operations.*

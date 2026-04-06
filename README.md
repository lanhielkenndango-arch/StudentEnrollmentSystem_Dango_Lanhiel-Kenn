# Student Enrollment System

## The Project Structure
The project is a Java Swing desktop application organized into the following components:
* **Main Entry Point:**  `StudentEnrollmentSystem.java` - The main class that launches the application.
* **GUI Windows:**
  * `StudentManagementWindow.java` - Interface for Student CRUD operations.
  * `CourseManagementWindow.java` - Interface for Course CRUD operations.
  * `EnrollmentManagementWindow.java` - Interface for enrolling students into courses.
* **Database & Data Access:**
  * `DBConnection.java` - Establishes the connection to the MySQL database.
  * `StudentDAO.java` - Contains the SQL queries to perform operations on the database.
  * `Student.java` - The object model representing a student.
* **Custom UI Components:**  `RoundedButton.java`, `RoundedPanel.java`, `RoundedTextField.java` - Custom Java Swing classes to give the interface a modern look.
* **Database File:**
  * `Enrollment System.mwb` - The MySQL Workbench Entity-Relationship Diagram (ERD).

## How to Run the Application
1. Clone or download the project files to your local computer.
2. Open the project in your preferred Java IDE (e.g., NetBeans, Eclipse, IntelliJ IDEA).
3. Ensure that the required dependency (MySQL JDBC Driver) is added to your project's Build Path / Libraries.
4. Open `DBConnection.java` and update the database password (`your_password_here`) to match your local MySQL setup.
5. Run the `StudentEnrollmentSystem.java` file to launch the GUI.

## How to Set Up the MySQL Database
1. Make sure you have MySQL Server and MySQL Workbench installed and running.
2. Open MySQL Workbench.
3. You can either open the provided `Enrollment System.mwb` file and use the "Forward Engineer" tool to generate the database, or manually create a database named `student_enrollment_system`.
4. If creating manually, ensure you create the three required tables with the appropriate fields:
   * **Student**: `student_id` (PK), `first_name`, `last_name`, `age`, `email`
   * **Course**: `course_id` (PK), `course_name`, `course_description`, `credits`
   * **Enrolled Subject**: `enrollment_id` (PK), `student_id` (FK), `course_id` (FK), `enrollment_date`
5. Verify the database is running on `localhost:3306` before starting the Java application.

## Dependencies Required
* **Java Development Kit (JDK):** Version 8 or higher to compile and run the Java code.
* **MySQL Database Server:** To host the local database.
* **MySQL JDBC Driver (mysql-connector-j):** Required for the Java application to communicate with the MySQL database. You must download the `.jar` file and add it to the project's libraries.

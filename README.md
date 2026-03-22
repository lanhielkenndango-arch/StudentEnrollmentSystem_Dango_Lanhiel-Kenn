STUDENT ENROLLMENT SYSTEM (CRUD)

DESCRIPTION
- The Student Enrollment System is a modern desktop application built using Java Swing and MySQL, designed to streamline the management of academic records through a professional and intuitive interface.

KEY FEATURES
- Full CRUD Functionality: Allows users to Create, Read, Update, and Delete records for students and courses seamlessly.
- Enrollment Management: A dedicated module that manages the bridge between students and courses using a 1:N non-identifying relationship.
- Modern UI Design: Features custom-drawn rounded components and a globally applied Nimbus Look and Feel for a sleek, consistent aesthetic.
- Automated Refresh Logic: Data tables stay perfectly in sync with the MySQL database after every action without requiring manual intervention.

TECHNOLOGIES USED
- Programming Language: Java (JDK 8 or higher).
- Database: MySQL 8.0 for robust data storage and relationship management.
- GUI Framework: Java Swing and AWT for the desktop interface.
- Database Driver: JDBC (MySQL Connector/J) for secure connectivity.
- Pattern: Data Access Object (DAO) for clean, organized code.

DATABASE STRUCTURE
- The system utilizes three core tables: student, course, and enrolled_subject. These are linked via Foreign Keys to ensure data integrity, allowing one student to enroll in many courses while maintaining independent record identities.

SETUP INSTRUCTIONS
Database Setup: Create a new schema named student_enrollment_system in your MySQL Workbench.

Configuration: Update the DBConnection.java file with your specific MySQL username and password.

Execution: Run the StudentEnrollmentSystem.java file. This is the main entry point that initializes the Nimbus theme and opens the Student Management Window.

https://drive.google.com/file/d/1I7BrkW2Ig_cFoGkdQ5YO3u1iFfDsLf6k/view?usp=sharing

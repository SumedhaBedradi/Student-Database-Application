# Student Database Application

## Overview

This Student Database Application is a Java-based program that simulates a student management system. It allows you to:
- Enroll students with their personal information.
- Enroll students in courses and track tuition balances.
- Make payments toward tuition and display the student’s current financial standing.

## Features

- **Student Enrollment**: Allows students to enter their details like first name, last name, and grade level, and automatically generates a unique student ID.
  
- **Course Enrollment**: Students can enroll in multiple courses, with each course having a fixed tuition fee. The system allows students to stop course enrollment by entering "Q".

- **Tuition Payment**: Displays the current tuition balance, allows students to make payments, and adjusts the balance accordingly.

- **Student Information**: After tuition payment, the student's information, including name, grade level, student ID, courses enrolled, and remaining balance, is displayed.

## Requirements

- Java 8 or higher.

## How to Run the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/student-database-application.git
    cd student-database-application
    ```

2. Compile the Java files:
    ```bash
    javac Student.java StudentDatabaseSystem.java
    ```

3. Run the program:
    ```bash
    java StudentDatabaseSystem
    ```

4. Follow the on-screen prompts to:
    - Enter the number of students.
    - Input student details.
    - Enroll in courses and make tuition payments.

## Usage

1. **Student Enrollment**: 
    - The program will prompt for the student's first name, last name, and grade year.
    - A unique student ID will be generated.
  
2. **Course Enrollment**: 
    - The user can input courses they want to enroll in, and each course costs $600. Type "Q" to stop course enrollment.
  
3. **Tuition Payment**: 
    - After enrollment, the user will be prompted to pay part of or the full tuition fee. 

4. **Student Information**: 
    - After each payment, the program will display the student's details, including their current balance.

## Example

When the program runs, the output might look like this:

Enter number of new students to enroll: 2 Enter student first name: John 
Enter student last name: Doe 
1-Freshmen 2-Sophmore 3-Junior 4-Senior 
Enter student class level: 1 
Student ID: 1001 
Enter course to enroll(Q to quit): Math 
Enter course to enroll(Q to quit): History 
Enter course to enroll(Q to quit): Q 
ENROLLED IN: Math History 
TUITION BALANCE: $1200 
Enter your payment 500 
Thank you for your payment of $500 
Your balance is: $700

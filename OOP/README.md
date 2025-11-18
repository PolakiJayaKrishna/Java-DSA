.

📘 Student Management System – OOP Mini Project (Java)

A console-based Student Management System built using Object-Oriented Programming (OOP) concepts in Java.

This project demonstrates:

Inheritance

Abstract Classes

Interfaces

Encapsulation

Validation

Polymorphism

Menu-based navigation

Multiple Student handling using ArrayList

✅ Features

Add new students

List all students

Update marks

Pay fees (via interface implementation)

Show student role

Full validation on inputs

Clean object design using OOP principles

🧱 Project Structure
OOP/
 ├── Person.java        (abstract parent class)
 ├── Student.java       (child class + Payable interface + validations)
 ├── Payable.java       (interface)
 └── Main.java          (menu-based console application)

 ![UML Diagram](OOP/uml.png)


🧠 OOP Concepts Used
🔹 1. Inheritance

Student extends Person.

🔹 2. Abstract Class

Person is abstract and forces child classes to implement showRole().

🔹 3. Interface

Payable ensures all payable entities implement payFees().

🔹 4. Encapsulation

All fields are private; access is controlled through getters/setters.

🔹 5. Polymorphism

showRole() and payFees() behave differently depending on object type.

▶️ How to Run

Compile all files:

javac OOP/*.java


Run Main:

java OOP.Main

📋 Menu Options
1. Add student
2. List students
3. Update marks
4. Pay fees
5. Show role
6. Exit

🧪 Sample Output
--- Student App ---
1. Add student
2. List students
3. Update marks
4. Pay fees
5. Show role
6. Exit
Choose:

🚀 Why this project is useful

Builds a strong foundation in OOP

Perfect mini-project for resumes

Shows real-world coding patterns

Demonstrates menu handling, validation, and object design

💡 Future Enhancements

(You will get the complete list in a later step)

👤 Author

Jayakrishna (Jay)
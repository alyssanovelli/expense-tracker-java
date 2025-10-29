# Expense Tracker (Java)
A Java-based console application that helps users log, view, and manage personal expenses. Built with core Java principles, it supports adding, deleting, searching, and categorizing expenses, along with viewing totals and saving data to files.

## Table of Contents
-[Overview](#overview)
-[Goals](#goals)
-[Features](#features)
-[Technologies](#technologies)
-[How to Run](#how-to-run)
-[Testing](#testing)
-[Future Improvements](#future-improvements)
-[Author](#author)

## Overview
This project demonstrates Java fundamentals, including classes, file handling, and data management. The Expense Tracker provides a simple text-based interface for users to track and analyze personal spending.

## Goals
-Strengthen Java programming and OOP skills  
-Build a real-world, console-based application  
-Practice clean code and documentation  
-Introduce JUnit testing

## Features
-Add, view, and delete expenses  
-View total spending and totals by category  
-Search expenses by keyword  
-Sort by date or amount  
-Save and load data from files  
-Handle invalid user inputs  
-Include Javadoc documentation  
-Basic JUnit tests

## Technologies
-Java (JDK 17)  
-JUnit for testing  
-Git and GitHub for version control  
-VS Code / IntelliJ IDEA

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/expense-tracker-java.git
   cd expense-tracker-java
   ```
2. Compile the program:
   ```bash
   javac *.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

## Testing
Once JUnit is configured, run tests through your IDE or terminal:
```bash
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ExpenseTest
```

## Future Improvements
-Add a GUI using JavaFX or Swing  
-Enable recurring expenses  
-Export reports to CSV  
-Connect to a database (SQLite)  
-Visualize spending trends with charts

## Author
**Alyssa Novelli**  
-Direct email: [anovelli028@gmail.com](mailto:anovelli028@gmail.com)  
-GitHub: [https://github.com/alyssanovelli](https://github.com/alyssanovelli)
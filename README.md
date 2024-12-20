# Student Grade Tracker

A simple Java application for teachers to manage student grades, calculate averages, and determine the highest and lowest scores. This application offers a straightforward interface to add grades and view key performance statistics.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Code Structure](#code-structure)

## Project Overview
The **Student Grade Tracker** program provides teachers with an easy-to-use tool to manage student grades. Using Java's `ArrayList`, this application stores grades dynamically and allows teachers to:
1. Enter student grades.
2. Calculate the average score.
3. Display the highest and lowest scores.

This project is a part of a Java Development internship, focusing on building fundamental Java applications and implementing algorithmic solutions.

## Features
- **Add Grades**: Enter grades for students as they are recorded.
- **Calculate Average**: View the average of all entered grades.
- **Find Highest and Lowest Grades**: Quickly see the highest and lowest grades from the data.
- **User-Friendly Menu**: Navigate through options easily with a text-based menu interface.

## Technologies Used
- **Java**: Core language for application logic and data handling.
- **ArrayList**: Used to store and manage grades dynamically.

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Nikhith-08/CodeAlpha_Student-Grade-Tracker.git
2. **Navigate to the Project Directory:**
   ```bash
   cd student-grade-tracker
3. **Compile the Program:**
   ```bash
   javac Student_Grade_Tracker.java
4. **Run the Program:**
   ```bash
   java Student_Grade_Tracker

## Usage
1. Select options by entering the corresponding number.
2. For option `1`, you will be prompted to enter a grade.
3. Choose options `2`, `3`, or `4` to view the average, highest, or lowest grade, respectively.
4. Select option `5` to exit the program.

## Code Structure
### `StudentGradeTracker` Class
- **Fields**:
- `grades` - Stores grades entered by the teacher.

- **Methods**:
- `addGrade(double grade)`: Adds a grade to the list.
- `calculateAverage()`: Calculates and returns the average of all grades.
- `findHighestGrade()`: Returns the highest grade.
- `findLowestGrade()`: Returns the lowest grade.

- **Menu Loop**:
- The main method provides an interactive menu, allowing teachers to choose actions, view results, or add grades until they decide to exit.


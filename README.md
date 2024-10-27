# Student Grade Tracker

A simple Java application for teachers to manage student grades, calculate averages, and determine the highest and lowest scores. This application offers a straightforward interface to add grades and view key performance statistics.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Contributing](#contributing)
- [License](#license)

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
   [git clone https://github.com/Nikhith-08/CodeAlpha_Student-Grade-Tracker.git]
2. Select options by entering the corresponding number.
3. For option `1`, you will be prompted to enter a grade.
4. Choose options `2`, `3`, or `4` to view the average, highest, or lowest grade, respectively.
5. Select option `5` to exit the program.

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

## Contributing
Contributions are welcome! If you would like to improve this project, please:
1. Fork the repository.
2. Create a new branch for your feature (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.


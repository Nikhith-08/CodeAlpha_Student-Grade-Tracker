
import java.util.ArrayList;
import java.util.Scanner;

public class Student_Grade_Tracker {

    private final ArrayList<Double> grades;

    public Student_Grade_Tracker() {
        grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return !grades.isEmpty() ? sum / grades.size() : 0;
    }

    // Method to find the highest grade
    public double findHighestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public double findLowestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
    
    // Display menu options
    public static void displayMenu() {
        System.out.println("\nGrade Tracker Menu:");
        System.out.println("1. Add a Grade");
        System.out.println("2. Display Average Grade");
        System.out.println("3. Display Highest Grade");
        System.out.println("4. Display Lowest Grade");
        System.out.println("5. Exit");
        System.out.print("\nChoose an option: ");
    }
    
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Student Grade Tracker!");
        try (Scanner scanner = new Scanner(System.in)) {

            Student_Grade_Tracker tracker = new Student_Grade_Tracker();
            boolean exit = false;

            while (!exit) {
                displayMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("\nEnter grade: ");
                        double grade = scanner.nextDouble();
                        tracker.addGrade(grade);
                        System.out.println("\nGrade added successfully.");
                    }
                    case 2 ->
                        System.out.println("\nAverage Grade: " + tracker.calculateAverage());
                    case 3 ->
                        System.out.println("\nHighest Grade: " + tracker.findHighestGrade());
                    case 4 ->
                        System.out.println("\nLowest Grade: " + tracker.findLowestGrade());
                    case 5 -> {
                        exit = true;
                        System.out.println("\nExiting the Grade Tracker.\n");
                    }
                    default ->
                        System.out.println("\nInvalid option. Please try again.");
                }
            }
        }
    }
}

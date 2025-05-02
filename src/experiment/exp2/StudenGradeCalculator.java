package experiment.exp2;
import java.util.Scanner;

public class StudenGradeCalculator {
          public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner obj = new Scanner(System.in);

        // Prompt the user to enter marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = obj.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = obj.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = obj.nextInt();

        // Calculate the average of the three subjects
        double average = (subject1 + subject2 + subject3) / 3.0;

        // Determine the grade based on the average
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Display the average and the final grade
        System.out.printf("Average marks: %.2f%n", average);
        System.out.println("Final Grade: " + grade);

        // Close the scanner
        obj.close();
    }
}



package exp8;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentDataWriter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = input.nextLine();

        System.out.print("Enter grade: ");
        String grade = input.nextLine();

        // Writing to file
        try {
            FileWriter writer = new FileWriter("student.txt", true); // 'true' means append mode

            // Writing formatted data
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");

            writer.close(); // Close the writer to save the file
            System.out.println("Student data saved to student.txt successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        input.close();
    }
}
